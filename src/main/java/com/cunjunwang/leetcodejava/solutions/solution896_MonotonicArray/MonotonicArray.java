package com.cunjunwang.leetcodejava.solutions.solution896_MonotonicArray;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class MonotonicArray {

    /**
     * An array is monotonic if it is either monotone increasing or
     * monotone decreasing.
     * An array A is monotone increasing if for all i <= j, A[i] <= A[j].
     * An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
     * Return true if and only if the given array A is monotonic.
     * <p>
     * Example 1:
     * Input: [1,2,2,3]
     * Output: true
     * <p>
     * Example 2:
     * Input: [6,5,4,4]
     * Output: true
     * <p>
     * Example 3:
     * Input: [1,3,2]
     * Output: false
     * <p>
     * Example 4:
     * Input: [1,2,4,5]
     * Output: true
     * <p>
     * Example 5:
     * Input: [1,1,1]
     * Output: true
     * <p>
     * Note:
     * 1 <= A.length <= 50000
     * -100000 <= A[i] <= 100000
     *
     * @param A
     * @return
     */
    public boolean isMonotonic(int[] A) {
        if (A == null) return false;
        if (A.length <= 2) return true;
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                increasing = false;
            }
            if (A[i] > A[i + 1]) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

}
