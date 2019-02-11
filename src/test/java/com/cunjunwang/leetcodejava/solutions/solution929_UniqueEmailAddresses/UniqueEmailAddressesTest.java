package com.cunjunwang.leetcodejava.solutions.solution929_UniqueEmailAddresses;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/11
 */
public class UniqueEmailAddressesTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private UniqueEmailAddresses uniqueEmailAddresses;

    @Test
    public void numUniqueEmails() {
        logger.info("测试开始");
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        Integer result = uniqueEmailAddresses.numUniqueEmails(emails);
        logger.info("测试完毕, 结果: {}", result);
    }

    @Test
    public void handlePlus() {
        String email = "baidu+132+123@gmail.com";
        logger.info(uniqueEmailAddresses.handlePlus(email));
    }
}