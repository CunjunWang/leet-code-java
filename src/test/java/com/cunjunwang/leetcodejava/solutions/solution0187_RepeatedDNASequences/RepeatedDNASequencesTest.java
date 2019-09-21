package com.cunjunwang.leetcodejava.solutions.solution0187_RepeatedDNASequences;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-09-21.
 */
public class RepeatedDNASequencesTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private RepeatedDNASequences repeatedDNASequences;

    @Test
    public void findRepeatedDnaSequences() {
        String s = "AAAAAAAAAAA";
        repeatedDNASequences.findRepeatedDnaSequences(s);
    }
}