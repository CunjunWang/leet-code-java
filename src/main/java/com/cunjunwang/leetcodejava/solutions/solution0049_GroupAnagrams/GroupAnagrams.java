package com.cunjunwang.leetcodejava.solutions.solution0049_GroupAnagrams;

import java.util.*;

/**
 * Created by CunjunWang on 2019-10-31.
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0)
            return result;

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] tempArray = s.toCharArray();
            Arrays.sort(tempArray);
            String key = new String(tempArray);

            List<String> strings = map.get(key);
            if (strings == null) {
                strings = new LinkedList<>();
                strings.add(s);
                map.put(key, strings);
            } else {
                map.get(key).add(s);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

}
