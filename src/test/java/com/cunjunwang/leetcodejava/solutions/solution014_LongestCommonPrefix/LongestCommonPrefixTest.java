package com.cunjunwang.leetcodejava.solutions.solution014_LongestCommonPrefix;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-04-13.
 */
public class LongestCommonPrefixTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private LongestCommonPrefix longestCommonPrefix;

    @Test
    public void longestCommonPrefixDCMethod() {
        String[] strs = new String[]{"leetcodes", "leets", "lee", "leet", "le"};
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        logger.info("Result = {}", result);
        Assert.assertEquals(result, "le");
    }
}