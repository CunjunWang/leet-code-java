package com.cunjunwang.leetcodejava.solutions.solution709_ToLowerCase;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-17.
 */
@Component
public class ToLowerCase {

    /**
     * Implement function ToLowerCase() that has a string parameter str,
     * nd returns the same string in lowercase.
     * <p>
     * Example 1:
     * Input: "Hello"
     * Output: "hello"
     * <p>
     * Example 2:
     * Input: "here"
     * Output: "here"
     * <p>
     * Example 3:
     * Input: "LOVELY"
     * Output: "lovely"
     *
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if ('A' <= charArr[i] && charArr[i] <= 'Z') {
                charArr[i] = (char) (charArr[i] - 'A' + 'a');
            }
        }
        return new String(charArr);
    }
}
