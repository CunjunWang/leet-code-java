package com.cunjunwang.leetcodejava.solutions.solution0516_LongestPalindromicSubsequence;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by CunjunWang on 2019-09-21.
 */
@Component
public class LongestPalindromicSubsequence {

    int[][] memo;

    public int longestPalindromeSubseq(String s) {
        int size = s.length();
        memo = new int[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(memo[i], 0);
        }
        int l = 0, r = s.length() - 1;
        return doRecursion(s, l, r);
    }

    private int doRecursion(String s, int l, int r) {
        if (l == r)
            return 1;
        if (l > r)
            return 0;
        if (memo[l][r] != 0) {
            return memo[l][r];
        }
        memo[l][r] = s.charAt(l) == s.charAt(r) ?
                2 + doRecursion(s, l + 1, r - 1) :
                Math.max(doRecursion(s, l + 1, r), doRecursion(s, l, r - 1));
        return memo[l][r];
    }

}
