package com.cunjunwang.leetcodejava.solutions.solution438_FindAllAnagramsInAString;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by CunjunWang on 2019-04-25.
 */
@Component
public class FindAllAnagramsInAString {

    /**
     * Given a string s and a non-empty string p, find all the start
     * indices of p's anagrams in s.
     * <p>
     * Strings consists of lowercase English letters only and the length
     * of both strings s and p will not be larger than 20,100.
     * <p>
     * The order of output does not matter.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * s: "cbaebabacd" p: "abc"
     * <p>
     * Output:
     * [0, 6]
     * <p>
     * Explanation:
     * The substring with start index = 0 is "cba", which is an anagram of "abc".
     * The substring with start index = 6 is "bac", which is an anagram of "abc".
     * <p>
     * <p>
     * Example 2:
     * <p>
     * Input:
     * s: "abab" p: "ab"
     * <p>
     * Output:
     * [0, 1, 2]
     * <p>
     * Explanation:
     * The substring with start index = 0 is "ab", which is an anagram of "ab".
     * The substring with start index = 1 is "ba", which is an anagram of "ab".
     * The substring with start index = 2 is "ab", which is an anagram of "ab".
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }

        int sizeToCompare = p.length();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length() - sizeToCompare + 1; i++) {
            String sub = s.substring(i, i + sizeToCompare);
            if (isAnagram(sub, p)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isAnagram(String s, String p) {
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(pArr);
        return Arrays.equals(sArr, pArr);
    }


}
