package com.cunjunwang.leetcodejava.solutions.solution1071_GreatestCommonDivisorOfStrings;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class GreatestCommonDivisorOfStrings {

    /**
     * For strings S and T, we say "T divides S" if and only
     * if S = T + ... + T  (T concatenated with itself 1 or more times)
     * Return the largest string X such that X divides str1
     * and X divides str2.
     * <p>
     * Example 1:
     * Input: str1 = "ABCABC", str2 = "ABC"
     * Output: "ABC"
     * <p>
     * Example 2:
     * Input: str1 = "ABABAB", str2 = "ABAB"
     * Output: "AB"
     * <p>
     * Example 3:
     * Input: str1 = "LEET", str2 = "CODE"
     * Output: ""
     *
     * @param str1
     * @param str2
     * @return
     */
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        if (!str1.startsWith(str2)) return "";
        if (str2.isEmpty()) return str1;
        return gcdOfStrings(str1.substring(str2.length()), str2);
    }

}
