package com.cunjunwang.leetcodejava.solutions.solution443_StringCompression;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-08.
 */
@Component
public class StringCompressionTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(StringCompressionTest.class);

    @Autowired
    private StringCompression stringCompression;

    @Test
    public void compress() {
        char[] chars1 = new char[]{'a'};
        logger.info("chars1 = {}, result = {}", chars1, stringCompression.compress(chars1));
        char[] chars2 = new char[]{'a','a','b','b','c','c','c'};
        logger.info("chars2 = {}, result = {}", chars2, stringCompression.compress(chars2));
    }
}