package com.cunjunwang.leetcodejava.solutions.solution012_IntegerToRoman;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-08-05.
 */
@Component
public class IntegerToRoman {

    /**
     * Roman numerals are represented by seven different symbols:
     * I, V, X, L, C, D and M.
     * <p>
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, two is written as II in Roman numeral, just two
     * one's added together. Twelve is written as, XII, which is
     * simply X + II. The number twenty seven is written as XXVII,
     * which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from
     * left to right. However, the numeral for four is not IIII.
     * Instead, the number four is written as IV. Because the one
     * is before the five we subtract it making four. The same principle
     * applies to the number nine, which is written as IX. There are
     * six instances where subtraction is used:
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given an integer, convert it to a roman numeral. Input is
     * guaranteed to be within the range from 1 to 3999.
     * <p>
     * Example 1:
     * Input: 3
     * Output: "III"
     * <p>
     * Example 2:
     * Input: 4
     * Output: "IV"
     * <p>
     * Example 3:
     * Input: 9
     * Output: "IX"
     * <p>
     * Example 4:
     * Input: 58
     * Output: "LVIII"
     * Explanation: L = 50, V = 5, III = 3.
     * <p>
     * Example 5:
     * Input: 1994
     * Output: "MCMXCIV"
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     *
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        return "";
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
