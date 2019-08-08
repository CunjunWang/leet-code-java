package com.cunjunwang.leetcodejava.solutions.solution190_ReverseBits;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class ReverseBits {

    /**
     * Reverse bits of a given 32 bits unsigned integer.
     * <p>
     * Example 1:
     * Input: 00000010100101000001111010011100
     * Output: 00111001011110000010100101000000
     * Explanation: The input binary string 00000010100101000001111010011100
     * represents the unsigned integer 43261596, so return 964176192 which
     * its binary representation is 00111001011110000010100101000000.
     * <p>
     * Example 2:
     * Input: 11111111111111111111111111111101
     * Output: 10111111111111111111111111111111
     * Explanation: The input binary string 11111111111111111111111111111101
     * represents the unsigned integer 4294967293, so return 3221225471 which
     * its binary representation is 10101111110010110010011101101001.
     * <p>
     * Note:
     * Note that in some languages such as Java, there is no unsigned integer
     * type. In this case, both input and output will be given as signed integer
     * type and should not affect your implementation, as the internal binary
     * representation of the integer is the same whether it is signed or unsigned.
     * In Java, the compiler represents the signed integers using 2's complement
     * notation. Therefore, in Example 2 above the input represents the signed
     * integer -3 and the output represents the signed integer -1073741825.
     *
     * @param n
     * @return
     */
    // TODO:
    public int reverseBits(int n) {
        String binaryString = Integer.toUnsignedString(n, 2);
        if (binaryString.length() < 32) {
            int diff = 32 - binaryString.length();
            String s = "";
            for (int i = 0; i < diff; i++) {
                s = s + "0";
            }
            binaryString = s + binaryString;
        }
        StringBuilder builder = new StringBuilder(binaryString);
        String reverse = builder.reverse().toString();
        int result = new Double(-1 * Integer.valueOf(reverse.substring(0, 1)) * Math.pow(2, reverse.length() - 1)).intValue();
        for (int i = 0; i < reverse.length(); i++) {
            result += Integer.valueOf(reverse.substring(i, i + 1)) * Math.pow(2, reverse.length() - 1 - i);
        }
        return result;
    }

}
