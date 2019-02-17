package com.cunjunwang.leetcodejava.solutions.solution811_SubdomainVisitCount;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/17
 */
public class SubdomainVisitCountTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private SubdomainVisitCount subdomainVisitCount;

    @Test
    public void subdomainVisits() {
        logger.info("测试开始");
        String[] input1Array = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> result = subdomainVisitCount.subdomainVisits(input1Array);
        logger.info("Input 1: {}", result);
    }
}