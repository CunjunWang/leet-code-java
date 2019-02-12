package com.cunjunwang.leetcodejava.solutions.solution009_PalindromeNumber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Create by cunjunwang on 2019/2/12
 */
@Component
public class PalindromeNumber {

    private static final Logger logger = LoggerFactory.getLogger("Logger");


    /**
     * Determine whether an integer is a palindrome. An integer is a palindrome
     * when it reads the same backward as forward.
     * <p>
     * Example 1:
     * Input: 121
     * Output: true
     * <p>
     * Example 2:
     * Input: -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it
     * becomes 121-. Therefore it is not a palindrome.
     * <p>
     * Example 3:
     * Input: 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     * <p>
     * Follow up:
     * <p>
     * Coud you solve it without converting the integer to a string?
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        // logger.info("str: {}", str);
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        // logger.info("reverse: {}", builder.toString());
        return str.equals(builder.toString());
    }

}
