package com.cunjunwang.leetcodejava.solutions.solution509_FibonacciNumber;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-04-25.
 */
@Component
public class FibonacciNumber {

    private Map<Integer, Integer> map = new HashMap<>();

    /**
     * The Fibonacci numbers, commonly denoted F(n) form a sequence,
     * called the Fibonacci sequence, such that each number is the sum
     * of the two preceding ones, starting from 0 and 1. That is,
     * <p>
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), for N > 1.
     * Given N, calculate F(N).
     * <p>
     * <p>
     * Example 1:
     * Input: 2
     * Output: 1
     * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
     * <p>
     * Example 2:
     * Input: 3
     * Output: 2
     * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
     * <p>
     * Example 3:
     * Input: 4
     * Output: 3
     * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
     * <p>
     * <p>
     * Note:
     * <p>
     * 0 ≤ N ≤ 30.
     *
     * @param N
     * @return
     */
    public int fib(int N) {
        int[] arr = new int[N + 1];
        Arrays.fill(arr, -1);
        return helper(N, arr);
    }

    public int helper(int n, int[] arr) {
        if (arr[n] < 0) {
            if (n == 0) {
                arr[n] = 0;
            } else if (n == 1) {
                arr[n] = 1;
            } else {
                arr[n] = helper(n - 2, arr) + helper(n - 1, arr);
            }
        }
        return arr[n];
    }

}
