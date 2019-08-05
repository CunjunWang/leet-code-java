package com.cunjunwang.leetcodejava.solutions.solution326_PowerOfThree;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-05.
 */
@Component
public class PowerOfThree {

    /**
     * Given an integer, write a function to determine
     * if it is a power of three.
     * <p>
     * Example 1:
     * Input: 27
     * Output: true
     * <p>
     * Example 2:
     * Input: 0
     * Output: false
     * <p>
     * Example 3:
     * Input: 9
     * Output: true
     * <p>
     * Example 4:
     * Input: 45
     * Output: false
     *
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return n == 1;
    }

}
