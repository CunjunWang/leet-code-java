package com.cunjunwang.leetcodejava.solutions.solution035_SearchInsertPosition;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-19.
 */
@Component
public class SearchInsertPosition {

    /**
     * Given a sorted array and a target value, return the index
     * if the target is found. If not, return the index where it
     * would be if it were inserted in order.
     * You may assume no duplicates in the array.
     * <p>
     * Example 1:
     * Input: [1,3,5,6], 5
     * Output: 2
     * <p>
     * Example 2:
     * Input: [1,3,5,6], 2
     * Output: 1
     * <p>
     * Example 3:
     * Input: [1,3,5,6], 7
     * Output: 4
     * <p>
     * Example 4:
     * Input: [1,3,5,6], 0
     * Output: 0
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                if (i == 0) {
                    return 0;
                } else {
                    return i;
                }
            } else if (nums[i] == target) {
                return i;
            } else {
                if (i == nums.length - 1) {
                    return nums.length;
                }
            }
        }
        return nums.length;
    }
}
