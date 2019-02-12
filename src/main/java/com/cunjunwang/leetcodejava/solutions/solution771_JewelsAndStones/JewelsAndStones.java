package com.cunjunwang.leetcodejava.solutions.solution771_JewelsAndStones;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by cunjunwang on 2019/2/12
 */
@Component
public class JewelsAndStones {

    /**
     * You're given strings J representing the types of stones that are jewels,
     * and S representing the stones you have.  Each character in S is a type
     * of stone you have.  You want to know how many of the stones you have are
     * also jewels.
     * <p>
     * The letters in J are guaranteed distinct, and all characters in J and S
     * are letters. Letters are case sensitive, so "a" is considered a different
     * type of stone from "A".
     * <p>
     * Example 1:
     * <p>
     * Input: J = "aA", S = "aAAbbbb"
     * Output: 3
     * <p>
     * Example 2:
     * <p>
     * Input: J = "z", S = "ZZ"
     * Output: 0
     * Note:
     * <p>
     * S and J will consist of letters and have length at most 50.
     * The characters in J are distinct.
     *
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            Character character = S.charAt(i);
            Integer count = map.get(character);
            if (count == null) {
                map.put(character, 1);
            } else {
                count = count + 1;
                map.put(character, count);
            }
        }

        Integer sum = 0;
        for (int j = 0; j < J.length(); j++) {
            if (map.get(J.charAt(j)) != null) {
                sum += map.get(J.charAt(j));
            }
        }
        return sum;
    }
}
