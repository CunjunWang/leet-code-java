package com.cunjunwang.leetcodejava.solutions.solution334_IncreasingTripletSubsequence;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-05.
 */
@Component
public class IncreasingTripletSubsequence {

    /**
     * Given an unsorted array return whether an increasing
     * subsequence of length 3 exists or not in the array.
     * Formally the function should:
     * Return true if there exists i, j, k
     * such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
     * Note: Your algorithm should run in O(n) time complexity and O(1) space complexity.
     * <p>
     * Example 1:
     * Input: [1,2,3,4,5]
     * Output: true
     * <p>
     * Example 2:
     * Input: [5,4,3,2,1]
     * Output: false
     *
     * @param nums
     * @return
     */
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return false;
        }
        int small = Integer.MAX_VALUE;
        int medium = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= small) {
                small = num;
            } else if (num <= medium) {
                medium = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
