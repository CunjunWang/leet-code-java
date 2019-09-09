package com.cunjunwang.leetcodejava.solutions.solution0186_ReverseWordsInAStringII;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-09-09.
 */
@Component
public class ReverseWordsInAStringII {

    public void reverseWords(char[] s) {
        if (s == null || s.length == 0)
            return;

        int l = 0, r = s.length - 1;
        while (l <= r) {
            swap(s, l, r);
            l++;
            r--;
        }

        int j = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ' || i == s.length - 1) {
                int start = j, end = i == s.length - 1 ? i : i - 1;
                while (start <= end) {
                    swap(s, start, end);
                    start++;
                    end--;
                }
                j = i + 1;
            }
        }

    }

    private void swap(char[] s, int l, int r) {
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }
}
