package com.cunjunwang.leetcodejava.solutions.solution121_BestTimeToBuyAndSellStock;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/11
 */
public class BestTimeToBuyAndSellStockTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @Test
    public void maxProfit() {
        logger.info("开始测试");
        int[] array = {7, 6, 4, 3, 1};
        int result = bestTimeToBuyAndSellStock.maxProfit(array);
        logger.info("测试完毕, 结果: {}", result);
    }
}