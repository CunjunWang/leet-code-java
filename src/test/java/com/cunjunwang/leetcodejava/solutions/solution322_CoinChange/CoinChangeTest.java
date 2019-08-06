package com.cunjunwang.leetcodejava.solutions.solution322_CoinChange;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-05.
 */
public class CoinChangeTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private CoinChange coinChange;

    @Test
    public void coinChange() {
        int[] coins = new int[]{1,2,5};
        int amount = 11;
        int coinChange = this.coinChange.coinChange(coins, amount);
        logger.info("result = {}", coinChange);
    }
}