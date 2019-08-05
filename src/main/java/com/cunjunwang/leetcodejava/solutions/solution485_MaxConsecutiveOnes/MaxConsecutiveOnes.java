package com.cunjunwang.leetcodejava.solutions.solution485_MaxConsecutiveOnes;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-02.
 */
@Component
public class MaxConsecutiveOnes {

    /**
     * Given a binary array, find the maximum number of consecutive
     * 1s in this array.
     * <p>
     * Example 1:
     * Input: [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are
     * consecutive 1s. The maximum number of consecutive 1s is 3.
     * <p>
     * Note:
     * The input array will only contain 0 and 1.
     * The length of input array is a positive integer and will not exceed 10,000
     *
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = 0;
        for (int num : nums) {
            sum = sum + num;
            if (num == 0) {
                sum = 0;
            }
            max = sum >= max ? sum : max;
        }
        return max;
    }

}