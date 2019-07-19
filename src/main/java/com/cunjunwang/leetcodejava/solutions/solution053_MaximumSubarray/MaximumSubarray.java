package com.cunjunwang.leetcodejava.solutions.solution053_MaximumSubarray;

import org.springframework.stereotype.Component;

/**
 * Create by cunjunwang on 2019/2/12
 */
@Component
public class MaximumSubarray {

    /**
     * Given an integer array nums, find the contiguous subarray (containing
     * at least one number) which has the largest sum and return its sum.
     * <p>
     * Example:
     * <p>
     * Input: [-2,1,-3,4,-1,2,1,-5,4],
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     * <p>
     * Follow up:
     * <p>
     * If you have figured out the O(n) solution, try coding another solution
     * using the divide and conquer approach, which is more subtle.
     *
     * @param nums
     * @return
     */
    /* sub problem:
     * maxSubArray(int A[], int i), which means the maxSubArray
     * for A[0: i] which must has A[i] as the end element.
     * maxSubArray(A, i) = maxSubArray(A, i - 1) > 0 ? maxSubArray(A, i - 1) : 0 + A[i];
     */
    public int maxSubArrayDP(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n]; // dp[i] means the maximum subarray ending with A[i];
        dp[0] = nums[0];
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            if (dp[i] >= max) {
                max = dp[i];
            }
        }

        return max;
    }

    public int maxSubArrayDC(int[] nums) {
        // TODO: implement with divide and conquer
        return 0;
    }

}
