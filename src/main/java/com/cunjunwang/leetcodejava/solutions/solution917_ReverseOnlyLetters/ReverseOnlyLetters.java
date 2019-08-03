package com.cunjunwang.leetcodejava.solutions.solution917_ReverseOnlyLetters;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-03.
 */
@Component
public class ReverseOnlyLetters {

    /**
     * Given a string S, return the "reversed" string where all
     * characters that are not a letter stay in the same place,
     * and all letters reverse their positions.
     * <p>
     * Example 1:
     * Input: "ab-cd"
     * Output: "dc-ba"
     * <p>
     * Example 2:
     * Input: "a-bC-dEf-ghIj"
     * Output: "j-Ih-gfE-dCba"
     * <p>
     * Example 3:
     * Input: "Test1ng-Leet=code-Q!"
     * Output: "Qedo1ct-eeLg=ntse-T!"
     *
     * @param S
     * @return
     */
    // TODO: do another solution with stack
    public String reverseOnlyLetters(String S) {
        StringBuilder result = new StringBuilder();
        String letters = S.replaceAll("[^a-zA-Z]", "");
        int index = letters.length() - 1;
        for (int i = 0; i < S.length(); i++) {
            String s = S.substring(i, i + 1);
            if (s.matches("[a-zA-Z]")) {
                result.append(letters.charAt(index));
                index = index - 1;
            } else {
                result.append(s);
            }
        }
        return result.toString();
    }

}
