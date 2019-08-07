package com.cunjunwang.leetcodejava.solutions.solution1009_ComplementOfBase10Integer;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class ComplementOfBase10Integer {

    /**
     * Every non-negative integer N has a binary representation.
     * For example, 5 can be represented as "101" in binary,
     * 11 as "1011" in binary, and so on.  Note that except
     * for N = 0, there are no leading zeroes in any binary
     * representation.
     * The complement of a binary representation is the number
     * in binary you get when changing every 1 to a 0 and 0 to a 1.
     * For example, the complement of "101" in binary is "010" in binary.
     * For a given number N in base-10, return the complement of
     * it's binary representation as a base-10 integer.
     * <p>
     * Example 1:
     * Input: 5
     * Output: 2
     * Explanation: 5 is "101" in binary, with complement "010"
     * in binary, which is 2 in base-10.
     * <p>
     * Example 2:
     * Input: 7
     * Output: 0
     * Explanation: 7 is "111" in binary, with complement "000"
     * in binary, which is 0 in base-10.
     * <p>
     * Example 3:
     * Input: 10
     * Output: 5
     * Explanation: 10 is "1010" in binary, with complement "0101"
     * in binary, which is 5 in base-10.
     *
     * @param N
     * @return
     */
    public int bitwiseComplement(int N) {
        if (N == 0) return 1;
        StringBuilder builder = new StringBuilder();
        while (N != 0) {
            if (N % 2 == 0) {
                builder.append(1);
            } else {
                builder.append(0);
            }
            N = N / 2;
        }
        String representation = builder.toString();
        int sum = 0;
        for (int i = 0; i < representation.length(); i++) {
            sum += Integer.valueOf(representation.substring(i, i + 1)) * Math.pow(2, i);
        }
        return sum;
    }

}
