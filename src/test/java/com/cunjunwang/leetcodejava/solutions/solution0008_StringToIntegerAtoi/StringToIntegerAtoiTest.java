package com.cunjunwang.leetcodejava.solutions.solution0008_StringToIntegerAtoi;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-09-09.
 */
public class StringToIntegerAtoiTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private StringToIntegerAtoi stringToIntegerAtoi;

    @Test
    public void myAtoi() {
        String str = "42";
        System.out.println(stringToIntegerAtoi.myAtoi(str));
        str = "   -42";
        System.out.println(stringToIntegerAtoi.myAtoi(str));
        str = "4193 with words";
        System.out.println(stringToIntegerAtoi.myAtoi(str));
        str = "words and 987";
        System.out.println(stringToIntegerAtoi.myAtoi(str));
        str = "-91283472332";
        System.out.println(stringToIntegerAtoi.myAtoi(str));
    }
}