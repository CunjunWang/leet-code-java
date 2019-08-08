package com.cunjunwang.leetcodejava.solutions.solution191_NumberOf1Bits;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class NumberOf1Bits {

    /**
     * Write a function that takes an unsigned integer and return
     * the number of '1' bits it has (also known as the Hamming weight).
     * <p>
     * Example 1:
     * Input: 00000000000000000000000000001011
     * Output: 3
     * Explanation: The input binary string 00000000000000000000000000001011
     * has a total of three '1' bits.
     * <p>
     * Example 2:
     * Input: 00000000000000000000000010000000
     * Output: 1
     * Explanation: The input binary string 00000000000000000000000010000000
     * has a total of one '1' bit.
     * <p>
     * Example 3:
     * Input: 11111111111111111111111111111101
     * Output: 31
     * Explanation: The input binary string 11111111111111111111111111111101
     * has a total of thirty one '1' bits.
     *
     * @param n
     * @return
     */
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String unsignedString = Integer.toUnsignedString(n, 2);
        int sum = 0;
        for (int i = 0; i < unsignedString.length(); i++) {
            if (unsignedString.substring(i, i + 1).equals("1"))
                sum++;
        }
        return sum;
    }

}