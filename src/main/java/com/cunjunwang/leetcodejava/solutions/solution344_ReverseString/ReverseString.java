package com.cunjunwang.leetcodejava.solutions.solution344_ReverseString;

import org.springframework.stereotype.Component;

/**
 * Create by cunjunwang on 2019/2/14
 */
@Component
public class ReverseString {

    /**
     * Write a function that reverses a string. The input string is given as an array of characters char[].
     * <p>
     * Do not allocate extra space for another array, you must do this by modifying the
     * input array in-place with O(1) extra memory.
     * <p>
     * You may assume all the characters consist of printable ascii characters.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: ["h","e","l","l","o"]
     * Output: ["o","l","l","e","h"]
     * <p>
     * Example 2:
     * <p>
     * Input: ["H","a","n","n","a","h"]
     * Output: ["h","a","n","n","a","H"]
     *
     * @param s
     */
    public void reverseString(char[] s) {
        int j = s.length - 1;
        int i = 0;
        while (i < j - i) {
            char a = s[i];
            s[i] = s[j - i];
            s[j - i] = a;
            i++;
        }
    }

}
