package com.cunjunwang.leetcodejava.solutions.solution0266_PalindromePermutation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-10-29.
 */
public class PalindromePermutation {

    public boolean canPermutePalindrome(String s) {
        if (s.length() <= 1)
            return true;

        Map<Character, Integer> record = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            record.put(c, record.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        for (char c : record.keySet()) {
            count += record.get(c) % 2;
        }

        return count <= 1;
    }

}
