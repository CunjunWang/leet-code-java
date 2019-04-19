package com.cunjunwang.leetcodejava.solutions.solution125_ValidPalindrome;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-19.
 */
@Component
public class ValidPalindrome {

    /**
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     *
     * Note: For the purpose of this problem, we define empty string as valid palindrome.
     *
     * Example 1:
     *
     * Input: "A man, a plan, a canal: Panama"
     * Output: true
     *
     * Example 2:
     *
     * Input: "race a car"
     * Output: false
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-z^A-Z^0-9]", "").toLowerCase();
        return isPalindromeString(s);
    }

    private boolean isPalindromeString(String s) {
        if (s == null) return false;
        if (s.isEmpty()) return true;
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
