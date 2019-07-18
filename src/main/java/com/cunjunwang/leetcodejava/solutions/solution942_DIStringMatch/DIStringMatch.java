package com.cunjunwang.leetcodejava.solutions.solution942_DIStringMatch;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-07-18.
 */
@Component
public class DIStringMatch {

    /**
     * Given a string S that only contains "I" (increase) or "D" (decrease),
     * let N = S.length.
     * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
     * If S[i] == "I", then A[i] < A[i+1]
     * If S[i] == "D", then A[i] > A[i+1]
     * <p>
     * Example 1:
     * Input: "IDID"
     * Output: [0,4,1,3,2]
     * <p>
     * Example 2:
     * Input: "III"
     * Output: [0,1,2,3]
     * <p>
     * Example 3:
     * Input: "DDI"
     * Output: [3,2,0,1]
     * <p>
     * Note:
     * 1 <= S.length <= 10000
     * S only contains characters "I" or "D".
     *
     * @param S
     * @return
     */
    public int[] diStringMatch(String S) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= S.length(); i++) {
            list.add(i);
        }
        int[] result = new int[S.length() + 1];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                result[i] = list.get(0);
                list.remove(0);
            } else {
                result[i] = list.get(list.size() - 1);
                list.remove(list.size() - 1);
            }
        }
        result[result.length - 1] = list.get(0);

        return result;
    }

}
