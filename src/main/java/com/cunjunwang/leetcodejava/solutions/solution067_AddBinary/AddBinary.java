package com.cunjunwang.leetcodejava.solutions.solution067_AddBinary;

import org.springframework.stereotype.Component;

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
        int lengthA = a.length();
        int lengthB = b.length();
        int minLength = Math.min(lengthA, lengthB);
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < minLength; i++) {
            String aDigit = a.substring(lengthA - i - 1, lengthA - i);
            String bDigit = b.substring(lengthB - i - 1, lengthB - i);
            int digit = Integer.valueOf(aDigit) + Integer.valueOf(bDigit) + carry;
            if (digit >= 2) {
                digit = digit % 2;
                carry = 1;
            } else {
                carry = 0;
            }
            builder.append(digit);
        }
        String currentResult = builder.reverse().toString();

        builder = new StringBuilder();
        String remainResult = null;
        if (lengthA == lengthB) {
            if (carry == 1) {
                currentResult = builder.append(carry).append(currentResult).toString();
            }
            return currentResult;
        } else if (lengthA > lengthB) {
            String remain = a.substring(0, lengthA - minLength);
            remainResult = addCarry(remain, carry);
        } else {
            String remain = b.substring(0, lengthB - minLength);
            remainResult = addCarry(remain, carry);
        }
        builder.append(remainResult).append(currentResult);
        return builder.toString();
    }

    private String addCarry(String remain, int carry) {
        if (carry == 0) {
            return remain;
        }
        int length = remain.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            String remainStr = remain.substring(length - i - 1, length - i);
            int digit = Integer.valueOf(remainStr) + carry;
            if (digit >= 2) {
                digit = digit % 2;
                carry = 1;
            } else {
                carry = 0;
            }
            result.append(digit);
        }
        if (carry == 1) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

}
