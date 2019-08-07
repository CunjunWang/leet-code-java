package com.cunjunwang.leetcodejava.solutions.solution628_MaximumProductOfThreeNumbers;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class MaximumProductOfThreeNumbers {

    /**
     * Given an integer array, find three numbers whose product
     * is maximum and output the maximum product.
     * <p>
     * Example 1:
     * Input: [1,2,3]
     * Output: 6
     * <p>
     * Example 2:
     * Input: [1,2,3,4]
     * Output: 24
     * <p>
     * Note:
     * The length of the given array will be in range [3,10^4]
     * and all elements are in the range [-1000, 1000].
     * Multiplication of any three numbers in the input won't
     * exceed the range of 32-bit signed integer.
     *
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int product = 1;
        if (nums.length <= 3) {
            for (int num : nums) {
                product *= num;
            }
            return product;
        }
        Arrays.sort(nums);
        if (nums[1] >= 0) {
            return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        } else {
            return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3],
                    nums[0] * nums[1] * nums[nums.length - 1]);
        }
    }

}
