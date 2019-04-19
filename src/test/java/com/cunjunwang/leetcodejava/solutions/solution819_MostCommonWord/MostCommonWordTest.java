package com.cunjunwang.leetcodejava.solutions.solution819_MostCommonWord;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-04-19.
 */
public class MostCommonWordTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private MostCommonWord mostCommonWord;

    @Test
    public void mostCommonWord() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
        String result = mostCommonWord.mostCommonWord(paragraph, banned);
        logger.info("Result = {}", result);
    }

    @Test
    public void mostCommonWord2() {
        String paragraph = "Bob. hIt, baLl";
        String[] banned = new String[]{"bob", "hit"};
        String result = mostCommonWord.mostCommonWord(paragraph, banned);
        logger.info("Result = {}", result);
    }
}