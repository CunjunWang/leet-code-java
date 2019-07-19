package com.cunjunwang.leetcodejava.solutions.solution067_AddBinary;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-02-14.
 */
public class AddBinaryTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private AddBinary addBinary;

    @Test
    public void addBinary() {
//        logger.info("测试开始");

        String binary1 = "101111";
        String binary2 = "10";
        String result = addBinary.addBinary(binary1, binary2);
        logger.info("result = {}", result);

//        binary1 = "1";
//        binary2 = "111";
//        result = addBinary.addBinary(binary1, binary2);
//        logger.info("result = {}", result);
//
//        binary1 = "11";
//        binary2 = "1";
//        result = addBinary.addBinary(binary1, binary2);
//        logger.info("result = {}", result);
//
//        binary1 = "1010";
//        binary2 = "1011";
//        result = addBinary.addBinary(binary1, binary2);
//        logger.info("result = {}", result);
//
//        logger.info("测试结束");
    }
}