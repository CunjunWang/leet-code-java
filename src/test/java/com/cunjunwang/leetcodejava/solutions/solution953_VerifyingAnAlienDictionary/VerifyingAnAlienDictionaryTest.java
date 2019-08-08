package com.cunjunwang.leetcodejava.solutions.solution953_VerifyingAnAlienDictionary;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-07.
 */
public class VerifyingAnAlienDictionaryTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private VerifyingAnAlienDictionary verifyingAnAlienDictionary;

    @Test
    public void isAlienSorted() {
        String[] words = new String[]{"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        boolean alienSorted = verifyingAnAlienDictionary.isAlienSorted(words, order);
        logger.info("result = {}", alienSorted);
    }
}