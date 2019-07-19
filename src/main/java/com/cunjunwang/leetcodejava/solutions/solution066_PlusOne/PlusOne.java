package com.cunjunwang.leetcodejava.solutions.solution066_PlusOne;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-19.
 */
@Component
public class PlusOne {

    /**
     * Given a non-empty array of digits representing a non-negative
     * integer, plus one to the integer.
     * <p>
     * The digits are stored such that the most significant digit
     * is at the head of the list, and each element in the array contain
     * a single digit.
     * <p>
     * You may assume the integer does not contain any leading zero,
     * except the number 0 itself.
     * <p>
     * Example 1:
     * Input: [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * <p>
     * Example 2:
     * Input: [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int length = digits.length;
        int[] temp = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            int digit = digits[i] + carry;
            if (i == length - 1) {
                digit += 1;
            }
            if (digit >= 10) {
                carry = 1;
                digit = digit % 10;
            } else {
                carry = 0;
            }
            temp[i] = digit;
        }
        if (carry == 1) {
            int[] result = new int[length + 1];
            result[0] = carry;
            for (int i = 1; i < length + 1; i++) {
                result[i] = temp[i - 1];
            }
            return result;
        } else {
            return temp;
        }
    }

}
