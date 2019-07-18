package com.cunjunwang.leetcodejava.solutions.solution168_ExcelSheetColumnTitle;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-18.
 */
@Component
public class ExcelSheetColumnTitle {

    /**
     * Given a positive integer, return its corresponding column
     * title as appear in an Excel sheet.
     * <p>
     * For example:
     * <p>
     * 1 -> A
     * 2 -> B
     * 3 -> C
     * ...
     * 26 -> Z
     * 27 -> AA
     * 28 -> AB
     * ...
     * Example 1:
     * Input: 1
     * Output: "A"
     * <p>
     * Example 2:
     * Input: 28
     * Output: "AB"
     * <p>
     * Example 3:
     * Input: 701
     * Output: "ZY"
     *
     * @param n
     * @return
     */
    public String convertToTitle(int n) {
        byte base = (byte) 'A';
        StringBuilder builder = new StringBuilder();

        while (n > 0) {
            n--;
            builder.append((char) (base + n % 26));
            n /= 26;
        }

        return builder.reverse().toString();
    }

}
