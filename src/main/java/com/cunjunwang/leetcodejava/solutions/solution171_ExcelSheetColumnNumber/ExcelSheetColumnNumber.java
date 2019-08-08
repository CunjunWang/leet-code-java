package com.cunjunwang.leetcodejava.solutions.solution171_ExcelSheetColumnNumber;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class ExcelSheetColumnNumber {

    /**
     * Given a column title as appear in an Excel sheet,
     * return its corresponding column number.
     * For example:
     * <p>
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     * <p>
     * Example 1:
     * Input: "A"
     * Output: 1
     * <p>
     * Example 2:
     * Input: "AB"
     * Output: 28
     * <p>
     * Example 3:
     * Input: "ZY"
     * Output: 701
     *
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) - 'A' + 1) * Math.pow(26, s.length() - 1 - i);
        }
        return sum;
    }

}
