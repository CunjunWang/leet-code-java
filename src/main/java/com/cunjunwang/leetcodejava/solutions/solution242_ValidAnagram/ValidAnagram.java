package com.cunjunwang.leetcodejava.solutions.solution242_ValidAnagram;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by CunjunWang on 2019-04-19.
 */
@Component
public class ValidAnagram {

    /**
     * Given two strings s and t , write a function to determine if t is an anagram of s.
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     *
     * Note:
     * You may assume the string contains only lowercase alphabets.
     *
     * Follow up:
     * What if the inputs contain unicode characters? How would you adapt your solution to such case?
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        String s1 = new String(sArr);
        String t1 = new String(tArr);
        return s1.equals(t1);
    }

}
