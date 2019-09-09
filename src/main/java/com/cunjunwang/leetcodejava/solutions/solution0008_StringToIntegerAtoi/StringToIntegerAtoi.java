package com.cunjunwang.leetcodejava.solutions.solution0008_StringToIntegerAtoi;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-09-09.
 */

@Component
public class StringToIntegerAtoi {

    /**
     * Implement atoi which converts a string to an integer.
     * <p>
     * The function first discards as many whitespace characters as necessary
     * until the first non-whitespace character is found. Then, starting from this
     * character, takes an optional initial plus or minus sign followed by as many
     * numerical digits as possible, and interprets them as a numerical value.
     * <p>
     * The string can contain additional characters after those that form the integral
     * number, which are ignored and have no effect on the behavior of this function.
     * <p>
     * If the first sequence of non-whitespace characters in str is not a valid
     * integral number, or if no such sequence exists because either str is empty
     * or it contains only whitespace characters, no conversion is performed.
     * <p>
     * If no valid conversion could be performed, a zero value is returned.
     * <p>
     * Note:
     * Only the space character ' ' is considered as whitespace character.
     * Assume we are dealing with an environment which could only store integers
     * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. If the numerical
     * value is out of the range of representable values, INT_MAX (2^31 − 1) or
     * INT_MIN (−2^31) is returned.
     * <p>
     * Example 1:
     * Input: "42"
     * Output: 42
     * <p>
     * Example 2:
     * Input: "   -42"
     * Output: -42
     * Explanation: The first non-whitespace character is '-', which is the minus sign.
     * Then take as many numerical digits as possible, which gets 42.
     * <p>
     * Example 3:
     * Input: "4193 with words"
     * Output: 4193
     * Explanation: Conversion stops at digit '3' as the next character is not a
     * numerical digit.
     * <p>
     * Example 4:
     * Input: "words and 987"
     * Output: 0
     * Explanation: The first non-whitespace character is 'w', which is not a numerical
     * digit or a +/- sign. Therefore no valid conversion could be performed.
     * <p>
     * Example 5:
     * Input: "-91283472332"
     * Output: -2147483648
     * Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
     * Therefore INT_MIN (−2^31) is returned.
     *
     * @param str
     * @return
     */
    public int myAtoi(String str) {
//        str = str.trim();
//        String[] strArray = str.split("\\s");
//        String numberString = "";
//        for (String s : strArray) {
//            if (Character.isDigit(s.charAt(s.length() - 1))) {
//                numberString = s;
//                break;
//            }
//        }
//        if (numberString.isEmpty()) {
//            return 0;
//        }
//        int numberBeginIndex = 0;
//        boolean isNegative = false;
//        for (; numberBeginIndex < numberString.length(); numberBeginIndex++) {
//            char c = numberString.charAt(numberBeginIndex);
//            if (Character.isDigit(c)) {
//                break;
//            }
//        }
//        if (numberString.charAt(0) == '-') {
//            isNegative = true;
//        }
//        Long number = Long.valueOf(numberString);
//        if (number > Integer.MAX_VALUE) {
//            return Integer.MAX_VALUE;
//        } else if (isNegative && number < Integer.MIN_VALUE) {
//            return Integer.MIN_VALUE;
//        } else {
//            return number.intValue();
//        }

        str = str.trim();
        if (str.isEmpty())
            return 0;
        int sign = 1;
        int i = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = (str.charAt(0) == '-') ? -1 : 1;
            if (str.length() < 2 || !Character.isDigit(str.charAt(1))) {
                return 0;
            }
            i++;
        }
        int n = 0;
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                int d = str.charAt(i) - '0';
                if (n > (Integer.MAX_VALUE - d) / 10) { //Detect the integer overflow.
                    n = (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    return n;
                }
                n = n * 10 + d;
            } else {
                break;
            }
            i++;
        }
        return sign * n;
    }
}