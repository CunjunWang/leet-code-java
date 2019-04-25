package com.cunjunwang.leetcodejava.solutions.solution28_ImplementStrStr;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-25.
 */
@Component
public class ImplementStrStr {

    /**
     * Implement strStr().
     *
     * Return the index of the first occurrence of needle in haystack,
     * or -1 if needle is not part of haystack.
     *
     * Example 1:
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     *
     * Example 2:
     * Input: haystack = "aaaaa", needle = "bba"
     * Output: -1
     *
     * Clarification:
     * What should we return when needle is an empty string? This is
     * a great question to ask during an interview.
     * For the purpose of this problem, we will return 0 when needle is
     * an empty string. This is consistent to C's strstr() and Java's indexOf().
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        // TODO: do not use library method
        return haystack.indexOf(needle);
    }

}
