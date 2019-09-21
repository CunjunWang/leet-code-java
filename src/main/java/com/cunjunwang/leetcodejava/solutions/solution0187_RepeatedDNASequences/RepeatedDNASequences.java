package com.cunjunwang.leetcodejava.solutions.solution0187_RepeatedDNASequences;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by CunjunWang on 2019-09-21.
 */
@Component
public class RepeatedDNASequences {

    public List<String> findRepeatedDnaSequences(String s) {
        if (s == null || s.length() < 10) {
            return new ArrayList<>();
        }
        Set<String> res = new HashSet<>();
        Set<String> record = new HashSet<>();
        int size = s.length();
        for (int i = 0; i <= size - 10; i++) {
            String sub = s.substring(i, i + 10);
            if (record.contains(sub)) {
                res.add(sub);
            }
            record.add(sub);
        }
        return new ArrayList<>(res);
    }

}
