package com.cunjunwang.leetcodejava.solutions.solution038_CountAndSay;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-19.
 */
@Component
public class CountAndSay {

    /**
     * The count-and-say sequence is the sequence of integers with
     * the first five terms as following:
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * 1 is read off as "one 1" or 11.
     * 11 is read off as "two 1s" or 21.
     * 21 is read off as "one 2, then one 1" or 1211.
     * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of
     * the count-and-say sequence.
     * <p>
     * Note: Each term of the sequence of integers will be represented as a string.
     * <p>
     * Example 1:
     * Input: 1
     * Output: "1"
     * <p>
     * Example 2:
     * Input: 4
     * Output: "1211"
     *
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        StringBuilder current = new StringBuilder("1");
        StringBuilder prev;
        int count;
        char say;

        for (int i = 1; i < n; i++) {
            prev = current;
            current = new StringBuilder();
            count = 1;
            say = prev.charAt(0);
            int size = prev.length();
            for (int j = 1; j < size; j++) {
                if (prev.charAt(j) == say) {
                    count += 1;
                } else {
                    current.append(count).append(say);
                    count = 1;
                    say = prev.charAt(j);
                }
            }
            current.append(count).append(say);
        }
        return current.toString();
    }

}
