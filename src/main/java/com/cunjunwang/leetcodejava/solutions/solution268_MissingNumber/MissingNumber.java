package com.cunjunwang.leetcodejava.solutions.solution268_MissingNumber;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by CunjunWang on 2019-04-19.
 */
@Component
public class MissingNumber {

    /**
     * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
     * find the one that is missing from the array.
     * <p>
     * Example 1:
     * Input: [3,0,1]
     * Output: 2
     * <p>
     * Example 2:
     * Input: [9,6,4,2,3,5,7,0,1]
     * Output: 8
     * <p>
     * Note:
     * Your algorithm should run in linear runtime complexity. Could you implement
     * it using only constant extra space complexity?
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
