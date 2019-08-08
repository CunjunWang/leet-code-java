package com.cunjunwang.leetcodejava.solutions.solution205_IsomorphicStrings;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class IsomorphicStrings {

    /**
     * Given two strings s and t, determine if they are isomorphic.
     * Two strings are isomorphic if the characters in s can be replaced
     * to get t.
     * All occurrences of a character must be replaced with another
     * character while preserving the order of characters. No two
     * characters may map to the same character but a character may map
     * to itself.
     * <p>
     * Example 1:
     * Input: s = "egg", t = "add"
     * Output: true
     * <p>
     * Example 2:
     * Input: s = "foo", t = "bar"
     * Output: false
     * <p>
     * Example 3:
     * Input: s = "paper", t = "title"
     * Output: true
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> record = new HashMap<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (map.get(cs) == null) {
                if (record.get(ct) != null && record.get(ct) != cs) {
                    return false;
                }
                map.put(cs, ct);
                record.put(ct, cs);
            } else {
                if (t.charAt(i) != map.get(cs)) {
                    return false;
                }
            }
        }
        return true;
    }

}
