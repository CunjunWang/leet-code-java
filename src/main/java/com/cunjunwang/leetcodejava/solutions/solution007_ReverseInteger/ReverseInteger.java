package com.cunjunwang.leetcodejava.solutions.solution007_ReverseInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Create by cunjunwang on 2019/2/12
 */
@Component
public class ReverseInteger {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    /**
     * Given a 32-bit signed integer, reverse digits of an integer.
     * <p>
     * Example 1:
     * Input: 123
     * Output: 321
     * <p>
     * Example 2:
     * Input: -123
     * Output: -321
     * <p>
     * Example 3:
     * Input: 120
     * Output: 21
     * <p>
     * Note:
     * Assume we are dealing with an environment which could only store integers
     * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
     * of this problem, assume that your function returns 0 when the reversed
     * integer overflows.
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        try {
            String str;
            StringBuilder builder = new StringBuilder();

            if (x >= 0) {
                str = String.valueOf(x);
            } else {
                str = String.valueOf(x).substring(1);
                builder.append("-");
            }
            // logger.info("str: {}", str);

            for (int i = str.length() - 1; i >= 0; i--) {
                builder.append(str.charAt(i));
            }
            // logger.info("reverse: {}", builder.toString());
            // logger.info("parsed reverse: {}", Integer.parseInt(builder.toString()));
            return Integer.parseInt(builder.toString());

        } catch (Exception e) {
            return 0;
        }
    }

}
