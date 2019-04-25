package com.cunjunwang.leetcodejava.solutions.solution415_AddStrings;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-25.
 */
@Component
public class AddStrings {

    private int carry = 0;
    private int sum = 0;
    private int value = 0;
    private int digit1 = 0;
    private int digit2 = 0;
    private StringBuilder builder = new StringBuilder();


    /**
     * Given two non-negative integers num1 and num2 represented as string,
     * return the sum of num1 and num2.
     * <p>
     * Note:
     * <p>
     * The length of both num1 and num2 is < 5100.
     * Both num1 and num2 contains only digits 0-9.
     * Both num1 and num2 does not contain any leading zero.
     * You must not use any built-in BigInteger library or convert the inputs to integer directly.
     *
     * @param num1
     * @param num2
     * @return
     */
    public String addStrings(String num1, String num2) {
        int one = num1.length() - 1;
        int two = num2.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while (one >= 0 || two >= 0) {
            int a = one >= 0 ? num1.charAt(one) - '0' : 0;
            int b = two >= 0 ? num2.charAt(two) - '0' : 0;
            int sum = a + b + carry;
            carry = sum / 10;
            sum = sum % 10;
            result.append((char) (sum + '0'));
            one--;
            two--;
        }
        if (carry == 1) {
            result.append('1');
        }
        return result.reverse().toString();
    }

}
