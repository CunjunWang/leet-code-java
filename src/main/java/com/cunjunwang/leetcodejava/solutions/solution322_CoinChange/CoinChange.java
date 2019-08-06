package com.cunjunwang.leetcodejava.solutions.solution322_CoinChange;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-05.
 */
@Component
public class CoinChange {

    /**
     * You are given coins of different denominations and a total
     * amount of money amount. Write a function to compute the fewest
     * number of coins that you need to make up that amount. If that
     * amount of money cannot be made up by any combination of the
     * coins, return -1.
     * <p>
     * Example 1:
     * Input: coins = [1, 2, 5], amount = 11
     * Output: 3
     * Explanation: 11 = 5 + 5 + 1
     * <p>
     * Example 2:
     * Input: coins = [2], amount = 3
     * Output: -1
     * <p>
     * Note:
     * You may assume that you have an infinite number of each kind of coin.
     *
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = -1;
        }
        return helper(coins, amount, memo);
    }

    private int helper(int[] coins, int amount, int[] memo) {
        if (amount <= 0) {
            return 1;
        }
        if (memo[amount] != -1) {
            return memo[amount];
        }
        for (int i = 0; i < coins.length; i++) {
            if (amount - coins[i] >= 0) {
                memo[amount] = 1 + helper(coins, amount - coins[i], memo);
            }
        }
        return memo[amount];
    }

}
