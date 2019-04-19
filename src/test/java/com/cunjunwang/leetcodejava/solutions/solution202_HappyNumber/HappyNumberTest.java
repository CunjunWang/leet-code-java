package com.cunjunwang.leetcodejava.solutions.solution202_HappyNumber;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-04-19.
 */
public class HappyNumberTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private HappyNumber happyNumber;

    @Test
    public void isHappy() {
        int n1 = 19;
        boolean result1 = happyNumber.isHappy(n1);
        Assert.assertTrue(result1);
    }
}