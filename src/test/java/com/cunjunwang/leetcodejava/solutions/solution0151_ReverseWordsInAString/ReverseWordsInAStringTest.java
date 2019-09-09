package com.cunjunwang.leetcodejava.solutions.solution0151_ReverseWordsInAString;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-09-09.
 */
public class ReverseWordsInAStringTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private ReverseWordsInAString reverseWordsInAString;

    @Test
    public void reverseWords() {
        String s = "a good   example";
        String s1 = reverseWordsInAString.reverseWords(s);
        System.out.println(s1);
    }
}