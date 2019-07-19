package com.cunjunwang.leetcodejava.solutions.solution058_LengthOfLastWord;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-19.
 */
@Component
public class LengthOfLastWord {

    /**
     * Given a string s consists of upper/lower-case alphabets and
     * empty space characters ' ', return the length of last word in the string.
     * If the last word does not exist, return 0.
     * Note: A word is defined as a character sequence consists of non-space characters only.
     * <p>
     * Example:
     * Input: "Hello World"
     * Output: 5
     *
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty() || s.trim().isEmpty()) {
            return 0;
        }
        return s.split(" ")[s.split(" ").length - 1].length();
    }

}
