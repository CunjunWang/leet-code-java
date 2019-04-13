package com.cunjunwang.leetcodejava.solutions.solution387_FirstUniqueCharacterInAString;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-13.
 */
@Component
public class FirstUniqueCharacterInAString {

    /**
     * Given a string, find the first non-repeating character in it
     * and return it's index. If it doesn't exist, return -1.
     * <p>
     * Examples:
     * <p>
     * s = "leetcode"
     * return 0.
     * <p>
     * s = "loveleetcode",
     * return 2.
     * Note: You may assume the string contain only lowercase letters.
     *
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (s.indexOf(character) == s.lastIndexOf(character)) {
                return i;
            }
        }
        return -1;
    }

}
