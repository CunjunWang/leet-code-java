package com.cunjunwang.leetcodejava.solutions.solution557_ReverseWordsInAStringIII;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-03.
 */
@Component
public class ReverseWordsInAStringIII {

    /**
     * Given a string, you need to reverse the order of characters
     * in each word within a sentence while still preserving whitespace
     * and initial word order.
     * <p>
     * Example 1:
     * Input: "Let's take LeetCode contest"
     * Output: "s'teL ekat edoCteeL tsetnoc"
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        String[] words = s.split("\\s");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                builder.append(words[i].charAt(j));
            }
            if (i != words.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

}
