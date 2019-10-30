package com.cunjunwang.leetcodejava.solutions.solution0213_HouseRobberII;

/**
 * Created by CunjunWang on 2019-10-30.
 */
public class HouseRobberII {

    public int rob(int[] nums) {
        if (nums.length <= 1)
            return nums.length ==  0 ? 0 : nums[0];
        return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }

    public int rob(int[] nums, int left, int right) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        int robOdd = 0;
        int robEven = 0;

        for (int i = left; i < right; i++) {
            if (i % 2 == 0) {
                robEven = Math.max(robOdd, robEven + nums[i]);
            } else {
                robOdd = Math.max(robEven, robOdd + nums[i]);
            }
        }

        return Math.max(robOdd, robEven);
    }

}
