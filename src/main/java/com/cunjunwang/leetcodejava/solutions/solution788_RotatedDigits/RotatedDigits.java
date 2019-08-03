package com.cunjunwang.leetcodejava.solutions.solution788_RotatedDigits;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-03.
 */
@Component
public class RotatedDigits {

    /**
     * X is a good number if after rotating each digit individually
     * by 180 degrees, we get a valid number that is different from X.
     * Each digit must be rotated - we cannot choose to leave it alone.
     * <p>
     * A number is valid if each digit remains a digit after rotation.
     * 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other;
     * 6 and 9 rotate to each other, and the rest of the numbers do not
     * rotate to any other number and become invalid.
     * <p>
     * Now given a positive number N, how many numbers X from 1 to N are good?
     * <p>
     * Example:
     * Input: 10
     * Output: 4
     * Explanation:
     * There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
     * Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
     * <p>
     * Note:
     * N  will be in range [1, 10000].
     *
     * @param N
     * @return
     */
    // TODO: do with dp
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            if (s.contains("3") || s.contains("4") || s.contains("7")) {
                continue;
            }
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '2') {
                    result.append('5');
                } else if (c == '5') {
                    result.append('2');
                } else if (c == '6') {
                    result.append('9');
                } else if (c == '9') {
                    result.append('6');
                } else {
                    result.append(c);
                }
            }
            if (!s.equals(result.toString())) {
                count++;
            }
        }
        return count;
    }

}
