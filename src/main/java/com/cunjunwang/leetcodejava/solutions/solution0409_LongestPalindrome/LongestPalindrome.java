package com.cunjunwang.leetcodejava.solutions.solution0409_LongestPalindrome;

/**
 * Created by CunjunWang on 2019-10-29.
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        // loop through the string.
        // if the character appears a second time, set count[c] = 0 and length += 2
        // finally check whether there is some character with 1 left. if there is, add 1 to answer
        int[] count = new int[128];
        int res = 0;

        for (char c : s.toCharArray()) {
            count[c]++;
            if (count[c] == 2) {
                res += 2;
                count[c] = 0;
            }
        }

        for (int i = 0; i < 128; i++) {
            if (count[i] == 1) {
                res++;
                return res;
            }
        }

        return res;
    }

}
