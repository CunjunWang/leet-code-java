package com.cunjunwang.leetcodejava.solutions.solution977_SquaresOfASortedArray;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by CunjunWang on 2019-07-17.
 */
@Component
public class SquaresOfASortedArray {

    /**
     * Given an array of integers A sorted in non-decreasing order,
     * return an array of the squares of each number, also in sorted
     * non-decreasing order.
     * <p>
     * Example 1:
     * Input: [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * <p>
     * Example 2:
     * Input: [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= A.length <= 10000
     * -10000 <= A[i] <= 10000
     * A is sorted in non-decreasing order.
     *
     * @param A
     * @return
     */
    public int[] sortedSquares(int[] A) {
        if (A == null || A.length == 0) {
            return A;
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

}
