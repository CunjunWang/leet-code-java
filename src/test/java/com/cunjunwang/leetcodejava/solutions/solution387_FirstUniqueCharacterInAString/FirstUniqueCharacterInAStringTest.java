package com.cunjunwang.leetcodejava.solutions.solution387_FirstUniqueCharacterInAString;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-04-13.
 */
public class FirstUniqueCharacterInAStringTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private FirstUniqueCharacterInAString firstUniqueCharacterInAString;

    @Test
    public void firstUniqChar() {
        String s1 = "leetcode";
        int result1 = firstUniqueCharacterInAString.firstUniqChar(s1);
        logger.info("result 1 = {}", result1);
        Assert.assertEquals(result1, 0);

        String s2 = "loveleetcode";
        int result2 = firstUniqueCharacterInAString.firstUniqChar(s2);
        logger.info("result 2 = {}", result2);
        Assert.assertEquals(result2, 2);

        String s3 = "eeeee";
        int result3 = firstUniqueCharacterInAString.firstUniqChar(s3);
        logger.info("result 3 = {}", result3);
        Assert.assertEquals(result3, -1);

        String s4 = "";
        int result4 = firstUniqueCharacterInAString.firstUniqChar(s4);
        logger.info("result 4 = {}", result4);
        Assert.assertEquals(result4, -1);
    }
}