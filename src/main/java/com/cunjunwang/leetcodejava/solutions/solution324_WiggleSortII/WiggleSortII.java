package com.cunjunwang.leetcodejava.solutions.solution324_WiggleSortII;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by CunjunWang on 2019-08-05.
 */
@Component
public class WiggleSortII {

    /**
     * Given an unsorted array nums, reorder it such
     * that nums[0] < nums[1] > nums[2] < nums[3]....
     * <p>
     * Example 1:
     * Input: nums = [1, 5, 1, 1, 6, 4]
     * Output: One possible answer is [1, 4, 1, 5, 1, 6].
     * <p>
     * Example 2:
     * Input: nums = [1, 3, 2, 2, 3, 1]
     * Output: One possible answer is [2, 3, 1, 3, 1, 2].
     * <p>
     * Note:
     * You may assume all input has valid answer.
     * Follow Up:
     * Can you do it in O(n) time and/or in-place with O(1) extra space?
     *
     * @param nums
     */
    // TODO:
    public void wiggleSort(int[] nums) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (i % 2 == 0) {
//                if (nums[i] > nums[i + 1]) {
//                    int temp = nums[i];
//                    nums[i] = nums[i + 1];
//                    nums[i + 1] = temp;
//                }
//            } else {
//                if (nums[i] < nums[i + 1]) {
//                    int temp = nums[i];
//                    nums[i] = nums[i + 1];
//                    nums[i + 1] = temp;
//                }
//            }
//        }
        Arrays.sort(nums);
        int mid = nums.length / 2 + 1;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[nums.length - mid];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = nums[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = nums[i + mid];
        }
        int j = 0, k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = arr1[j];
                j++;
            } else {
                nums[i] = arr2[k];
                k++;
            }
        }
    }

}
