package com.cunjunwang.leetcodejava.solutions.solution0137_SingleNumberII;

import java.util.HashMap;

/**
 * Created by CunjunWang on 2019-09-21.
 */
public class SingleNumberII {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i : nums) {
            if (record.get(i) == null) {
                record.put(i, 1);
            } else {
                record.put(i, record.get(i) + 1);
            }
        }
        for (int key : record.keySet()) {
            if (record.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
}
