package com.cunjunwang.leetcodejava.solutions.solution482_LicenseKeyFormatting;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/12
 */
public class LicenseKeyFormattingTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private LicenseKeyFormatting licenseKeyFormatting;

    @Test
    public void licenseKeyFormatting() {
        logger.info("开始测试");

        String input1 = "5F3Z-2e-9-w";
        int k1 = 4;
        String result1 = licenseKeyFormatting.licenseKeyFormatting(input1, k1);
        Assert.assertEquals(result1, "5F3Z-2E9W");

        String input2 = "2-5g-3-J";
        int k2 = 2;
        String result2 = licenseKeyFormatting.licenseKeyFormatting(input2, k2);
        Assert.assertEquals(result2, "2-5G-3J");

        String input3 = "---";
        int k3 = 3;
        String result3 = licenseKeyFormatting.licenseKeyFormatting(input3, k3);
        Assert.assertEquals(result3, "");

        logger.info("测试完成");
    }
}