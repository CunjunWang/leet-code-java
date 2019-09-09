package com.cunjunwang.leetcodejava.solutions.solution0001_TwoSum;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create by cunjunwang on 2019/2/12
 */
public class TwoSumTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private TwoSum twoSum;

    @Test
    public void twoSumBF() {
        logger.info("测试开始");
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSumOn(input, target);
        logger.info("测试完成, 结果: {}", result);
    }
}