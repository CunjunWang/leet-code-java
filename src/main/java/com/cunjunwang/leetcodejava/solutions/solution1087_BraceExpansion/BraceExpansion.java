package com.cunjunwang.leetcodejava.solutions.solution1087_BraceExpansion;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by CunjunWang on 2019-10-30.
 */
public class BraceExpansion {

    public String[] expand(String S) {
        // dfs with recursion
        if (S.length() <= 1)
            return new String[]{S};

        // use tree set for sorting on the way
        Set<String> collect = new TreeSet<>();

        // start with a bracket
        if (S.charAt(0) == '{') {
            // keep track of the content in the {}
            int c = 1;
            while (S.charAt(c) != '}')
                c++;
            String content = S.substring(1, c);
            String[] split = content.split(",");

            // dfs with the string after this bracket
            String[] res = expand(S.substring(c+1));

            // merge results and add to a set
            for (int i = 0; i < split.length; i++) {
                for (int j = 0; j < res.length; j++) {
                    collect.add(split[i] + res[j]);
                }
            }
        } else {
            // start with a normal character
            // do dfs with the following substring
            String[] res = expand(S.substring(1));

            // merge result with the first character
            // and add to the list
            for (int i = 0; i < res.length; i++) {
                String s = res[i];
                s = S.charAt(0) + s;
                collect.add(s);
            }
        }

        String[] arr = new String[collect.size()];
        arr = collect.toArray(arr);
        return arr;
    }

}
