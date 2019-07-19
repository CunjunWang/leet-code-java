package com.cunjunwang.leetcodejava.solutions.solution069_SqrtX;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-19.
 */
@Component
public class SqrtX {

    /**
     * Implement int sqrt(int x).
     * Compute and return the square root of x, where x is guaranteed
     * to be a non-negative integer.
     * <p>
     * Since the return type is an integer, the decimal digits are truncated
     * and only the integer part of the result is returned.
     * <p>
     * Example 1:
     * Input: 4
     * Output: 2
     * <p>
     * Example 2:
     * Input: 8
     * Output: 2
     * Explanation: The square root of 8 is 2.82842..., and since
     * the decimal part is truncated, 2 is returned.
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int left = 1;
        int right = x;
        while (true) {
            if (left + 1 >= right) {
                return left;
            }
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid;
            } else {
                left = left + 1;
            }
        }
    }

}
