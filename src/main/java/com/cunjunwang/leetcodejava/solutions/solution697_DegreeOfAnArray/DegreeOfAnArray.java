package com.cunjunwang.leetcodejava.solutions.solution697_DegreeOfAnArray;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class DegreeOfAnArray {

    /**
     * Given a non-empty array of non-negative integers nums, the degree
     * of this array is defined as the maximum frequency of any one of its
     * elements.
     * Your task is to find the smallest possible length of a (contiguous)
     * subarray of nums, that has the same degree as nums.
     * <p>
     * Example 1:
     * Input: [1, 2, 2, 3, 1]
     * Output: 2
     * Explanation:
     * The input array has a degree of 2 because both elements 1 and 2 appear twice.
     * Of the subarrays that have the same degree:
     * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
     * The shortest length is 2. So return 2.
     * <p>
     * Example 2:
     * Input: [1,2,2,3,1,4,2]
     * Output: 6
     *
     * @param nums
     * @return
     */
    public int findShortestSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxFrequency = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if (map.get(nums[i]) > maxFrequency) {
                maxFrequency = map.get(nums[i]);
            }
        }

        List<Integer> integerList = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == maxFrequency) {
                integerList.add(key);
            }
        }

        int minLength = Integer.MAX_VALUE;
        for (Integer degree : integerList) {
            int first = 0, last = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == degree) {
                    first = i;
                    break;
                }
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == degree) {
                    last = i;
                    break;
                }
            }
            minLength = Math.min(minLength, last - first + 1);
        }
        return minLength;
    }
}
