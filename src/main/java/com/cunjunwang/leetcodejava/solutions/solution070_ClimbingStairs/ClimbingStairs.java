package com.cunjunwang.leetcodejava.solutions.solution070_ClimbingStairs;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-04-25.
 */
@Component
public class ClimbingStairs {

    /**
     * You are climbing a stair case.
     * It takes n steps to reach to the top.
     * Each time you can either climb 1 or 2 steps.
     * In how many distinct ways can you climb to the top?
     * <p>
     * Note: Given n will be a positive integer.
     * <p>
     * Example 1:
     * Input: 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     * <p>
     * Example 2:
     * Input: 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     *
     * @param n
     * @return
     */
//    public int climbStairs(int n) {
//        int result = 0;
//        int totalNumberOfTwo = Math.floorDiv(n, 2);
//        for (int numberOfTwo = 0; numberOfTwo <= totalNumberOfTwo; numberOfTwo++) {
//            int numberOfOne = n - numberOfTwo * 2;
//            result = result + this.combination(numberOfOne, numberOfTwo);
//        }
//        return result;
//    }
//
//    private int combination(int numberOfOne, int numberOfTwo) {
//        int total = numberOfOne + numberOfTwo;
//        return this.factorial(total, 1)/(this.factorial(numberOfOne, 1)*this.factorial(numberOfTwo, 1));
//    }
//
//    private int factorial(int n, int result) {
//
//        if (n == 0) return result;
//        return factorial(n - 1, n * result);
//    }

    private Map<Integer, Integer> dp = new HashMap();

    public int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp.containsKey(n)) {
            return dp.get(n);
        }
        int count = climbStairs(n - 1) + climbStairs(n - 2);
        dp.put(n, count);
        return count;
    }

}
