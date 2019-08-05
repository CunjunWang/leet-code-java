package com.cunjunwang.leetcodejava.solutions.solution003_LongestSubstringWithoutRepeatingCharacters;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-05.
 */
@Component
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Given a string, find the length of the longest
     * substring without repeating characters.
     * <p>
     * Example 1:
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * <p>
     * Example 2:
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * <p>
     * Example 3:
     * Input: "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Note that the answer must be a substring, "pwke" is a
     * subsequence and not a substring.
     *
     * @param s
     * @return
     */
    // TODO: wrong
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() <= 1) {
            return s.length();
        }
        int max = 0;
        int currentLength = 1;
        String r = s.substring(0, 1);
        for (int j = 1; j < s.length(); j++) {
            String substring = s.substring(j, j + 1);
            if (!r.contains(substring)) {
                r = r + substring;
                currentLength++;
            } else {
                max = Math.max(currentLength, max);
                r = substring;
                currentLength = 1;
            }
        }
        max = Math.max(currentLength, max);
        return max;
    }

}
