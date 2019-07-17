package com.cunjunwang.leetcodejava.solutions.solution832_FlippingAnImage;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-17.
 */
@Component
public class FlippingAnImage {

    /**
     * Given a binary matrix A, we want to flip the image horizontally,
     * then invert it, and return the resulting image.
     * <p>
     * To flip an image horizontally means that each row of the image is reversed.
     * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
     * <p>
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced
     * by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
     * <p>
     * Example 1:
     * Input: [[1,1,0],[1,0,1],[0,0,0]]
     * Output: [[1,0,0],[0,1,0],[1,1,1]]
     * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
     * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
     * <p>
     * Example 2:
     * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
     * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
     * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * <p>
     * Notes:
     * 1 <= A.length = A[0].length <= 20
     * 0 <= A[i][j] <= 1
     *
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            int k = 0;
            for (int j = A[i].length - 1; j >= 0; j--) {
                B[i][k] = 1 - A[i][j];
                k++;
            }
        }
        return B;
    }

}
