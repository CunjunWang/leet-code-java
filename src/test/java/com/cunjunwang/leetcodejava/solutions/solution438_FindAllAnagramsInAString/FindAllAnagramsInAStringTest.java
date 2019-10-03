package com.cunjunwang.leetcodejava.solutions.solution438_FindAllAnagramsInAString;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.solution0438_FindAllAnagramsInAString.FindAllAnagramsInAString;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by CunjunWang on 2019-04-25.
 */
public class FindAllAnagramsInAStringTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(FindAllAnagramsInAStringTest.class);

    @Autowired
    private FindAllAnagramsInAString findAllAnagramsInAString;

    @Test
    public void findAnagrams() {
        String s1 = "cbaebabacd";
        String p1 = "abc";
        List<Integer> result1 = findAllAnagramsInAString.findAnagrams(s1, p1);
        logger.info("result1 = {}", result1);

        String s2 = "abab";
        String p2 = "ab";
        List<Integer> result2 = findAllAnagramsInAString.findAnagrams(s2, p2);
        logger.info("result2 = {}", result2);
    }
}