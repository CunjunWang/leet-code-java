package com.cunjunwang.leetcodejava.solutions.solution1047_RemoveAllAdjacentDuplicatesInString;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * Created by CunjunWang on 2019-06-30.
 */
@Component
public class RemoveAllAdjacentDuplicatesInString {

    /**
     * Given a string S of lowercase letters, a duplicate removal consists of
     * choosing two adjacent and equal letters, and removing them.
     * <p>
     * We repeatedly make duplicate removals on S until we no longer can.
     * <p>
     * Return the final string after all such duplicate removals have been made.
     * It is guaranteed the answer is unique.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: "abbaca"
     * Output: "ca"
     * Explanation:
     * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal,
     * and this is the only possible move.  The result of this move is that the string is "aaca",
     * of which only "aa" is possible, so the final string is "ca".
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= S.length <= 20000
     * S consists only of English lowercase letters.
     *
     * @param S
     * @return
     */
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            Character character = S.charAt(i);
            if (stack.isEmpty() || !character.equals(stack.peek())) {
                stack.push(character);
            } else {
                stack.pop();
            }
        }
        StringBuilder builder = new StringBuilder();
        stack.forEach(builder::append);
        return builder.toString();
    }

}
