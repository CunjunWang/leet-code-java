package com.cunjunwang.leetcodejava.solutions.solution520_DetectCapital;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class DetectCapital {

    /**
     * Given a word, you need to judge whether the usage of capitals
     * in it is right or not.
     * We define the usage of capitals in a word to be right when one
     * of the following cases holds:
     * <p>
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital, like "Google".
     * Otherwise, we define that this word doesn't use capitals in a right way.
     * <p>
     * Example 1:
     * Input: "USA"
     * Output: True
     * <p>
     * Example 2:
     * Input: "FlaG"
     * Output: False
     *
     * @param word
     * @return
     */
    public boolean detectCapitalUse(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        int capitalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }
        if (capitalCount == word.length()) {
            return true;
        } else if (capitalCount == 1 && Character.isUpperCase(word.charAt(0))){
            return true;
        } else if (capitalCount == 0) {
            return true;
        } else {
            return false;
        }
    }
}
