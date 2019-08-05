package com.cunjunwang.leetcodejava.solutions.solution006_ZigZagConversion;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-08-05.
 */
@Component
public class ZigZagConversion {

    /**
     * The string "PAYPALISHIRING" is written in a zigzag pattern
     * on a given number of rows like this: (you may want to display
     * this pattern in a fixed font for better legibility)
     * <p>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * And then read line by line: "PAHNAPLSIIGYIR"
     * <p>
     * Write the code that will take a string and make this conversion
     * given a number of rows:
     * string convert(string s, int numRows);
     * <p>
     * Example 1:
     * Input: s = "PAYPALISHIRING", numRows = 3
     * Output: "PAHNAPLSIIGYIR"
     * <p>
     * Example 2:
     * Input: s = "PAYPALISHIRING", numRows = 4
     * Output: "P I  N A L S  I  G Y A H  R P I"
     * 0 6 12 1 5 7 11 13 2 4 8 10 3 9
     * <p>
     * Explanation:
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (s.length() == 0) {
            return "";
        }
        if (s.length() <= numRows || numRows == 1) {
            return s;
        }
        Map<Integer, String> map = new HashMap<>();
        boolean increase = true;
        int row = 1;
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i, i + 1);
            if (map.get(row) == null) {
                map.put(row, substring);
            } else {
                map.put(row, map.get(row) + substring);
            }
            if (increase) {
                row++;
                if (row == numRows) {
                    increase = false;
                }
            } else {
                row--;
                if (row == 1) {
                    increase = true;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= numRows; i++) {
            result.append(map.get(i));
        }
        return result.toString();
    }

}
