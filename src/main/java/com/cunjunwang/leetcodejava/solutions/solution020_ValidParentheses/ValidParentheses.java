package com.cunjunwang.leetcodejava.solutions.solution020_ValidParentheses;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * Create by cunjunwang on 2019/2/11
 */
@Component
public class ValidParentheses {

    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid.
     * <p>
     * An input string is valid if:
     * <p>
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Note that an empty string is also considered valid.
     * <p>
     * Example 1:
     * <p>
     * Input: "()"
     * Output: true
     * Example 2:
     * <p>
     * Input: "()[]{}"
     * Output: true
     * Example 3:
     * <p>
     * Input: "(]"
     * Output: false
     * Example 4:
     * <p>
     * Input: "([)]"
     * Output: false
     * Example 5:
     * <p>
     * Input: "{[]}"
     * Output: true
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> parenStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (parenStack.isEmpty()) {
                parenStack.push(s.charAt(i));
            } else {
                Character top = parenStack.peek();
                if (isPair(top, s.charAt(i))) {
                    parenStack.pop();
                } else {
                    parenStack.push(s.charAt(i));
                }
            }
        }
        return parenStack.isEmpty();
    }

    public Boolean isPair(Character top, Character currentChar) {
        String charPair = top.toString() + currentChar.toString();
        return charPair.equals("()") || charPair.equals("[]") || charPair.equals("{}");
    }

}
