package com.cunjunwang.leetcodejava.solutions.solution067_AddBinary;

import org.springframework.stereotype.Component;

import java.math.BigInteger;

/**
 * Created by CunjunWang on 2019-02-14.
 */
@Component
public class AddBinary {

    /**
     * Given two binary strings, return their sum (also a binary string).
     * <p>
     * The input strings are both non-empty and contains only characters 1 or 0.
     * <p>
     * Example 1:
     * <p>
     * Input: a = "11", b = "1"
     * Output: "100"
     * <p>
     * Example 2:
     * <p>
     * Input: a = "1010", b = "1011"
     * Output: "10101"
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        return BigInteger.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

}
