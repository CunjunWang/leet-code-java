package com.cunjunwang.leetcodejava.solutions.solution349_IntersectionOfTwoArrays;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by CunjunWang on 2019-04-13.
 */
@Component
public class IntersectionOfTwoArrays {

    /**
     * Given two arrays, write a function to compute their intersection.
     * <p>
     * Example 1:
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2]
     * <p>
     * Example 2:
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [9,4]
     * <p>
     * Note:
     * Each element in the result must be unique.
     * The result can be in any order.
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) return new int[]{};
        if (nums1 == null) return nums2;
        if (nums2 == null) return nums1;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (set1.contains(nums2[j])) {
                intersection.add(nums2[j]);
            }
        }
        return intersection.stream().mapToInt(x -> x).toArray();
    }

}
