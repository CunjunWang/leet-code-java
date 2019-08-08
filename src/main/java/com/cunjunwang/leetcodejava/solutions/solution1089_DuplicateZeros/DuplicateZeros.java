package com.cunjunwang.leetcodejava.solutions.solution1089_DuplicateZeros;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class DuplicateZeros {

    /**
     * Given a fixed length array arr of integers, duplicate each
     * occurrence of zero, shifting the remaining elements to the right.
     * Note that elements beyond the length of the original array are
     * not written.
     * Do the above modifications to the input array in place, do not
     * return anything from your function.
     * <p>
     * Example 1:
     * Input: [1,0,2,3,0,4,5,0]
     * Output: null
     * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
     * <p>
     * Example 2:
     * Input: [1,2,3]
     * Output: null
     * Explanation: After calling your function, the input array is modified to: [1,2,3]
     * <p>
     * Note:
     * 1 <= arr.length <= 10000
     * 0 <= arr[i] <= 9
     *
     * @param arr
     */
    public void duplicateZeros(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }
}
