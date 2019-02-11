package com.cunjunwang.leetcodejava.solutions.solution020_ValidParentheses;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create by cunjunwang on 2019/2/11
 */
public class ValidParenthesesTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private ValidParentheses validParentheses;

    @Test
    public void isValid() {
        logger.info("测试开始");
        String input1 = "()"; // Output: true
        String input2 = "()[]{}"; // Output: true
        String input3 = "(]"; // Output: false
        String input4 = "([)]"; // Output: false
        String input5 = "{[]}"; // Output:true
        Boolean result0 = validParentheses.isValid("");
        Boolean result1 = validParentheses.isValid(input1);
        Boolean result2 = validParentheses.isValid(input2);
        Boolean result3 = validParentheses.isValid(input3);
        Boolean result4 = validParentheses.isValid(input4);
        Boolean result5 = validParentheses.isValid(input5);
        logger.info("测试结束, 结果: result0={}, result1={}, result2={}, result3={}, result4={}, result5={}",
                result0, result1, result2, result3, result4, result5);
    }

    @Test
    public void isPair() {
        Character top = '(';
        Character current = ')';
        Boolean result = validParentheses.isPair(top, current);
        logger.info("is {} and {} pair: {}", top, current, result);
    }
}