package com.cunjunwang.leetcodejava.solutions.solution217_ContainsDuplicate;

import org.springframework.stereotype.Component;

import java.util.TreeSet;

/**
 * Created by CunjunWang on 2019-08-02.
 */
@Component
public class ContainsDuplicate {

    /**
     * Given an array of integers, find if the array contains
     * any duplicates.
     * Your function should return true if any value appears at
     * least twice in the array, and it should return false if
     * every element is distinct.
     * <p>
     * Example 1:
     * Input: [1,2,3,1]
     * Output: true
     * <p>
     * Example 2:
     * Input: [1,2,3,4]
     * Output: false
     * <p>
     * Example 3:
     * Input: [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

}
