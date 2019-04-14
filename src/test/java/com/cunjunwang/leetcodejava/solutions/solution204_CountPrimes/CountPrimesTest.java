package com.cunjunwang.leetcodejava.solutions.solution204_CountPrimes;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-04-14.
 */
public class CountPrimesTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private CountPrimes countPrimes;

    @Test
    public void countPrimes() {
        logger.info("result 1 = {}", countPrimes.countPrimes(1));
        logger.info("result 2 = {}", countPrimes.countPrimes(2));
        logger.info("result 3 = {}", countPrimes.countPrimes(3));
        logger.info("result 4 = {}", countPrimes.countPrimes(4));
        logger.info("result 5 = {}", countPrimes.countPrimes(5));
        logger.info("result 6 = {}", countPrimes.countPrimes(10));
        logger.info("result 7 = {}", countPrimes.countPrimes(100));
        logger.info("result 8 = {}", countPrimes.countPrimes(1000));
        logger.info("result 9 = {}", countPrimes.countPrimes(10000));
    }
}