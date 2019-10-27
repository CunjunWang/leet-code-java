package com.cunjunwang.leetcodejava.solutions.solution443_StringCompression;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by CunjunWang on 2019-04-08.
 */
@Component
public class StringCompression {

    /**
     * Given an array of characters, compress it in-place.
     * The length after compression must always be smaller than or equal to the original array.
     * Every element of the array should be a character (not int) of length 1.
     * After you are done modifying the input array in-place, return the new length of the array.
     * <p>
     * Follow up:
     * Could you solve it using only O(1) extra space?
     * <p>
     * Example 1:
     * Input:
     * ["a","a","b","b","c","c","c"]
     * Output:
     * Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
     * Explanation:
     * "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
     * <p>
     * <p>
     * Example 2:
     * Input:
     * ["a"]
     * Output:
     * Return 1, and the first 1 characters of the input array should be: ["a"]
     * Explanation:
     * Nothing is replaced.
     * <p>
     * <p>
     * Example 3:
     * Input:
     * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
     * Output:
     * Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
     * Explanation:
     * Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
     * Notice each digit has it's own entry in the array.
     * <p>
     * <p>
     * Note:
     * All characters have an ASCII value in [35, 126].
     * 1 <= len(chars) <= 1000.
     *
     * @param chars
     * @return
     */
    public int compress(char[] chars) {
        int count = 1;
        if (chars.length == 1) {
            return count;
        }

        // Arrays.sort(chars);

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                if (chars[i + 1] == chars[i]) {
                    count++;
                } else {
                    if (count == 1) {
                        list.add(chars[i]);
                    } else {
                        list.add(chars[i]);
                        for (char c : String.valueOf(count).toCharArray()) {
                            list.add(c);
                        }
                    }
                    count = 1;
                }
            } else {
                list.add(chars[i]);
                if (chars[i] == chars[i - 1]) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        list.add(c);
                    }
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            chars[i] = list.get(i);
        }

        return list.size();

    }

}
