package com.cunjunwang.leetcodejava.solutions.solution693_BinaryNumberWithAlternatingBits;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class BinaryNumberWithAlternatingBits {

    /**
     * Given a positive integer, check whether it has alternating
     * bits: namely, if two adjacent bits will always have different values.
     * <p>
     * Example 1:
     * Input: 5
     * Output: True
     * Explanation:
     * The binary representation of 5 is: 101
     * <p>
     * Example 2:
     * Input: 7
     * Output: False
     * Explanation:
     * The binary representation of 7 is: 111.
     * <p>
     * Example 3:
     * Input: 11
     * Output: False
     * Explanation:
     * The binary representation of 11 is: 1011.
     * <p>
     * Example 4:
     * Input: 10
     * Output: True
     * Explanation:
     * The binary representation of 10 is: 1010.
     *
     * @param n
     * @return
     */
    public boolean hasAlternatingBits(int n) {
        if (n <= 1) return true;
        StringBuilder builder = new StringBuilder();
        while (n != 0) {
            builder.append(n % 2);
            n = n / 2;
        }
        String bits = builder.toString();
        for (int i = 0; i < bits.length() - 1; i++) {
            if (bits.substring(i, i + 1).equals(bits.substring(i + 1, i + 2))) {
                return false;
            }
        }
        return true;
    }
}
