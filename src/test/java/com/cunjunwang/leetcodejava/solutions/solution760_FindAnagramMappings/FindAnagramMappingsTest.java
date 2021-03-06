package com.cunjunwang.leetcodejava.solutions.solution760_FindAnagramMappings;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/11
 */
public class FindAnagramMappingsTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private FindAnagramMappings findAnagramMappings;

    @Test
    public void anagramMappings() {
        logger.info("测试开始");
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        int[] result = findAnagramMappings.anagramMappings(A, B);
        logger.info("测试结束, 结果: {}", result);
    }
}