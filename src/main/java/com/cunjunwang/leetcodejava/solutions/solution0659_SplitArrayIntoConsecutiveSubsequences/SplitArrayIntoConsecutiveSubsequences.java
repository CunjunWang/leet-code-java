package com.cunjunwang.leetcodejava.solutions.solution0659_SplitArrayIntoConsecutiveSubsequences;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-10-30.
 */
public class SplitArrayIntoConsecutiveSubsequences {

    public boolean isPossible(int[] nums) {
        // greedy algorithm
        if (nums == null || nums.length < 3)
            return false;

        // map to save the frequency of each number
        Map<Integer, Integer> freq = new HashMap<>();

        // map to save that the number of subsequences that are
        // ended with number i
        Map<Integer, Integer> tail = new HashMap<>();

        // first pass, fill teh freq map
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        // second pass:
        for (int i : nums) {
            // there is no such sumber available
            if (freq.get(i) == 0) {
                continue;
            }
            // if there is some subsequence that are ended with i - 1:
            // then we can put the number i in the subsequence
            if (tail.get(i-1) != null && tail.get(i-1) > 0) {
                // the number of sequence ended with i-1 decreases
                tail.put(i-1, tail.get(i-1) - 1);
                // the number of sequences ended with i increases
                tail.put(i, tail.getOrDefault(i, 0) + 1);
                // we use one number i, decrease the freq
                freq.put(i, freq.get(i) - 1);
            } else {
                // there is no such subsequence that ended with i-1
                // we build a new subsequence start with i,
                // we then need i + 1 and i + 2 to make a valid subsequence
                if (freq.get(i+1) != null && freq.get(i+1) > 0 &&
                        freq.get(i+2) != null && freq.get(i+2) > 0) {
                    // if we have available i + 1 and i + 2
                    // we now have one more subsequence ended with i+2
                    tail.put(i+2, tail.getOrDefault(i+2, 0) + 1);
                    // decrease the frequency
                    freq.put(i, freq.get(i) - 1);
                    freq.put(i + 1, freq.get(i + 1) - 1);
                    freq.put(i + 2, freq.get(i + 2) - 1);
                } else {
                    return false;
                }
            }
        }

        return true;
    }

}
