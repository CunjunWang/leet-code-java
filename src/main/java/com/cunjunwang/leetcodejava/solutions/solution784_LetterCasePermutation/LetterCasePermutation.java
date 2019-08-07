package com.cunjunwang.leetcodejava.solutions.solution784_LetterCasePermutation;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class LetterCasePermutation {

    /**
     * Given a string S, we can transform every letter individually
     * to be lowercase or uppercase to create another string.
     * Return a list of all possible strings we could create.
     * <p>
     * Examples:
     * Input: S = "a1b2"
     * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
     * <p>
     * Input: S = "3z4"
     * Output: ["3z4", "3Z4"]
     * <p>
     * Input: S = "12345"
     * Output: ["12345"]
     * <p>
     * Note:
     * S will be a string with length between 1 and 12.
     * S will consist only of letters or digits.
     *
     * @param S
     * @return
     */
    // TODO:
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        result.add(S);
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (Character.isLetter(c)) {

            }
        }
        return null;
    }

}
