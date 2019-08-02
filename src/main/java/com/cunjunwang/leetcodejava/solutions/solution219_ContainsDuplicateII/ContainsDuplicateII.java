package com.cunjunwang.leetcodejava.solutions.solution219_ContainsDuplicateII;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by CunjunWang on 2019-08-02.
 */
@Component
public class ContainsDuplicateII {

    /**
     * Given an array of integers and an integer k, find out
     * whether there are two distinct indices i and j in the
     * array such that nums[i] = nums[j] and the absolute
     * difference between i and j is at most k.
     * <p>
     * Example 1:
     * Input: nums = [1,2,3,1], k = 3
     * Output: true
     * <p>
     * Example 2:
     * Input: nums = [1,0,1,1], k = 1
     * Output: true
     * <p>
     * Example 3:
     * Input: nums = [1,2,3,1,2,3], k = 2
     * Output: false
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

}
