package com.cunjunwang.leetcodejava.solutions.solution003_LongestSubstringWithoutRepeatingCharacters;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-05.
 */
public class LongestSubstringWithoutRepeatingCharactersTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @Test
    public void lengthOfLongestSubstring() {
        String s = "dvdf";
        int i = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        logger.info("result for {} is {}", s, i);
    }
}