package com.cunjunwang.leetcodejava.solutions.solution013_RomanToInteger;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by cunjunwang on 2019/2/12
 */
@Component
public class RomanToInteger {

    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * <p>
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, two is written as II in Roman numeral, just two one's added together.
     * Twelve is written as, XII, which is simply X + II. The number twenty seven is written
     * as XXVII, which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from left to right. However,
     * the numeral for four is not IIII. Instead, the number four is written as IV.
     * Because the one is before the five we subtract it making four. The same principle
     * applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
     * <p>
     * Example 1:
     * <p>
     * Input: "III"
     * Output: 3
     * Example 2:
     * <p>
     * Input: "IV"
     * Output: 4
     * Example 3:
     * <p>
     * Input: "IX"
     * Output: 9
     * Example 4:
     * <p>
     * Input: "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     * Example 5:
     * <p>
     * Input: "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        Map<Character, Integer> symbolMap = initMap();
        if (s == null || s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return symbolMap.get(s.charAt(0));
        }

        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            if (symbolMap.get(s.charAt(i)) <= symbolMap.get(s.charAt(i - 1))) {
                result += symbolMap.get(s.charAt(i - 1));
            } else {
                result -= symbolMap.get(s.charAt(i - 1));
            }
        }
        result += symbolMap.get(s.charAt(s.length() - 1));

        return result;
    }

    private Map<Character, Integer> initMap() {
        Map<Character, Integer> symbolMap = new HashMap<>();
        symbolMap.put('I', 1);
        symbolMap.put('V', 5);
        symbolMap.put('X', 10);
        symbolMap.put('L', 50);
        symbolMap.put('C', 100);
        symbolMap.put('D', 500);
        symbolMap.put('M', 1000);
        return symbolMap;
    }

}
