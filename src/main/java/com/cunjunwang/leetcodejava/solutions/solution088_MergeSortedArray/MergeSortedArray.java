package com.cunjunwang.leetcodejava.solutions.solution088_MergeSortedArray;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Create by cunjunwang on 2019/2/14
 */
@Component
public class MergeSortedArray {

    /**
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1
     * as one sorted array.
     * <p>
     * Note:
     * <p>
     * The number of elements initialized in nums1 and nums2 are m and n respectively.
     * You may assume that nums1 has enough space (size that is greater or equal
     * to m + n) to hold additional elements from nums2.
     * <p>
     * Example:
     * <p>
     * Input:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * <p>
     * Output: [1,2,2,3,5,6]
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }

}
