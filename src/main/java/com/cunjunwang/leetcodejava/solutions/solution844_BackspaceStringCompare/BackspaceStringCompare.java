package com.cunjunwang.leetcodejava.solutions.solution844_BackspaceStringCompare;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * Created by CunjunWang on 2019-02-21.
 */
@Component
public class BackspaceStringCompare {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    /**
     * Given two strings S and T, return if they are equal when both are typed into
     * empty text editors. # means a backspace character.
     * <p>
     * Example 1:
     * <p>
     * Input: S = "ab#c", T = "ad#c"
     * Output: true
     * Explanation: Both S and T become "ac".
     * <p>
     * Example 2:
     * <p>
     * Input: S = "ab##", T = "c#d#"
     * Output: true
     * Explanation: Both S and T become "".
     * <p>
     * Example 3:
     * <p>
     * Input: S = "a##c", T = "#a#c"
     * Output: true
     * Explanation: Both S and T become "c".
     * <p>
     * Example 4:
     * <p>
     * Input: S = "a#c", T = "b"
     * Output: false
     * Explanation: S becomes "c" while T becomes "b".
     * <p>
     * Note:
     * <p>
     * 1 <= S.length <= 200
     * 1 <= T.length <= 200
     * S and T only contain lowercase letters and '#' characters.
     * <p>
     * Follow up:
     * <p>
     * Can you solve it in O(N) time and O(1) space?
     *
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompare(String S, String T) {
        return this.handleBackspace(S).equals(this.handleBackspace(T));
    }

    private String handleBackspace(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!characterStack.isEmpty()) {
                    characterStack.pop();
                }
            } else {
                characterStack.push(s.charAt(i));
            }
            // logger.info("Current String: {}", characterStack);
        }
        StringBuilder builder = new StringBuilder();
        while(!characterStack.isEmpty()) {
            builder.append(characterStack.pop());
        }
        // logger.info("Final String: {}", builder.toString());
        return builder.toString();
    }

}
