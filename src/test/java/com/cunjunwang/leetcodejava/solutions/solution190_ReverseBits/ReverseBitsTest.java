package com.cunjunwang.leetcodejava.solutions.solution190_ReverseBits;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-08.
 */
public class ReverseBitsTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private ReverseBits reverseBits;

    @Test
    public void reverseBits() {
        int n = 43261596;
        int i = reverseBits.reverseBits(n);
        logger.info("result = {}", i);
    }
}