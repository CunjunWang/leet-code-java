package com.cunjunwang.leetcodejava.solutions.solution0516_LongestPalindromicSubsequence;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-09-21.
 */
public class LongestPalindromicSubsequenceTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private LongestPalindromicSubsequence longestPalindromicSubsequence;

    @Test
    public void longestPalindromeSubseq() {
        String s = "bbbab";
        longestPalindromicSubsequence.longestPalindromeSubseq(s);
    }
}