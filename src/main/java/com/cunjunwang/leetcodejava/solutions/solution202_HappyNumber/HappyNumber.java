package com.cunjunwang.leetcodejava.solutions.solution202_HappyNumber;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-04-19.
 */
@Component
public class HappyNumber {

    /**
     * Write an algorithm to determine if a number is "happy".
     * <p>
     * A happy number is a number defined by the following process: Starting with any positive integer,
     * replace the number by the sum of the squares of its digits, and repeat the process until the
     * number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
     * Those numbers for which this process ends in 1 are happy numbers.
     * <p>
     * Example:
     * <p>
     * Input: 19
     * Output: true
     * Explanation:
     * 1^2 + 9^2 = 82
     * 8^2 + 2^2 = 68
     * 6^2 + 8^2 = 100
     * 1^2 + 0^2 + 0^2 = 1
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        List<Integer> record = new ArrayList<>();
        record.add(n);
        while (true) {
            String nString = String.valueOf(n);
            int powerSum = 0;
            for (int i = 0; i < nString.length(); i++) {
                char character = nString.charAt(i);
                int charInt = Integer.valueOf(String.valueOf(character));
                powerSum += new Double(Math.pow(charInt, 2)).intValue();
            }
            if (powerSum == 1) {
                return true;
            }
            if (record.contains(powerSum)) {
                return false;
            } else {
                record.add(powerSum);
            }
            n = powerSum;
        }
    }

}
