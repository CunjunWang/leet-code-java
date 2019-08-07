package com.cunjunwang.leetcodejava.solutions.solution976_LargestPerimeterTriangle;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class LargestPerimeterTriangle {

    /**
     * Given an array A of positive lengths, return the largest
     * perimeter of a triangle with non-zero area, formed from
     * 3 of these lengths.
     * If it is impossible to form any triangle of non-zero area,
     * return 0.
     * <p>
     * Example 1:
     * Input: [2,1,2]
     * Output: 5
     * <p>
     * Example 2:
     * Input: [1,2,1]
     * Output: 0
     * <p>
     * Example 3:
     * Input: [3,2,3,4]
     * Output: 10
     * <p>
     * Example 4:
     * Input: [3,6,2,3]
     * Output: 8
     * <p>
     * Note:
     * 3 <= A.length <= 10000
     * 1 <= A[i] <= 10^6
     *
     * @param A
     * @return
     */
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }

}
