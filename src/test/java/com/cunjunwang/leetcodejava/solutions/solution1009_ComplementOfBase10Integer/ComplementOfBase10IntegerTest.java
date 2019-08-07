package com.cunjunwang.leetcodejava.solutions.solution1009_ComplementOfBase10Integer;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-07.
 */
public class ComplementOfBase10IntegerTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private ComplementOfBase10Integer complementOfBase10Integer;

    @Test
    public void bitwiseComplement() {
        int N = 10;
        int bitwiseComplement = complementOfBase10Integer.bitwiseComplement(N);
        logger.info("result = {}", bitwiseComplement);
    }
}