package com.cunjunwang.leetcodejava.solutions.solution859_BuddyStrings;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-18.
 */
@Component
public class BuddyStrings {

    /**
     * Given two strings A and B of lowercase letters, return true
     * if and only if we can swap two letters in A so that the result equals B.
     * <p>
     * Example 1:
     * <p>
     * Input: A = "ab", B = "ba"
     * Output: true
     * Example 2:
     * <p>
     * Input: A = "ab", B = "ab"
     * Output: false
     * Example 3:
     * <p>
     * Input: A = "aa", B = "aa"
     * Output: true
     * Example 4:
     * <p>
     * Input: A = "aaaaaaabc", B = "aaaaaaacb"
     * Output: true
     * Example 5:
     * <p>
     * Input: A = "", B = "aa"
     * Output: false
     * <p>
     * <p>
     * Note:
     * <p>
     * 0 <= A.length <= 20000
     * 0 <= B.length <= 20000
     * A and B consist only of lowercase letters.
     *
     * @param A
     * @param B
     * @return
     */
    // TODO: not finished
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.isEmpty() || B.isEmpty()) {
            return false;
        }
        int count = 0;
        int sameCount = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(i)) {
                if (i == 0 || A.charAt(i) == A.charAt(i - 1)) {
                    sameCount = sameCount + 1;
                }
            } else {
                if (i == A.length() - 1) {
                    if (count == 0) {
                        return false;
                    } else {
                        continue;
                    }
                }
                if (A.charAt(i + 1) == B.charAt(i) &&
                        A.charAt(i) == B.charAt(i + 1)) {
                    count = count + 1;
                } else {
                    return false;
                }
            }
        }
        if (sameCount == A.length()) {
            return true;
        }
        return count == 1;
    }

}
