package com.cunjunwang.leetcodejava.solutions.solution204_CountPrimes;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-14.
 */
@Component
public class CountPrimes {

    /**
     * Count the number of prime numbers less than a non-negative number, n.
     * <p>
     * Example:
     * <p>
     * Input: 10
     * Output: 4
     * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     *
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int i) {
        if (i == 1) return false;
        if (i == 2) return true;
        int ceiling = (int) Math.ceil(Math.sqrt(i));
        for (int j = 2; j <= ceiling; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}
