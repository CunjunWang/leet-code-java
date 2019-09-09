package com.cunjunwang.leetcodejava.solutions.solution0186_ReverseWordsInAStringII;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-09-09.
 */
public class ReverseWordsInAStringIITest extends LeetCodeJavaApplicationTests {

    @Autowired
    private ReverseWordsInAStringII reverseWordsInAStringII;

    @Test
    public void reverseWords() {
        char[] s = {'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
        reverseWordsInAStringII.reverseWords(s);
        System.out.println(s);
    }
}