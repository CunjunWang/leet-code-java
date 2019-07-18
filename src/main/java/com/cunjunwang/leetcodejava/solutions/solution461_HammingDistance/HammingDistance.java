package com.cunjunwang.leetcodejava.solutions.solution461_HammingDistance;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-18.
 */
@Component
public class HammingDistance {

    /**
     * The Hamming distance between two integers is the number of positions
     * at which the corresponding bits are different.
     * <p>
     * Given two integers x and y, calculate the Hamming distance.
     * <p>
     * Note:
     * 0 ≤ x, y < 2^31.
     * <p>
     * Example:
     * Input: x = 1, y = 4
     * Output: 2
     * Explanation:
     * 1   (0 0 0 1)
     * 4   (0 1 0 0)
     * The above arrows point to positions where the corresponding bits are different.
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        return Integer.bitCount(xor);
    }



}
