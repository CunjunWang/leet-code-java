package com.cunjunwang.leetcodejava.solutions.solution824_GoatLatin;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-08-03.
 */
public class GoatLatinTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(GoatLatinTest.class);

    @Autowired
    private GoatLatin goatLatin;

    @Test
    public void toGoatLatin() {
        String s = "I speak Goat Latin";
        Assert.assertEquals(goatLatin.toGoatLatin(s), "Imaa peaksmaaa oatGmaaaa atinLmaaaaa");
    }
}