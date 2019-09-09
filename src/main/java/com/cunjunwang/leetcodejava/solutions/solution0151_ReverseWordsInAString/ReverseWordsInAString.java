package com.cunjunwang.leetcodejava.solutions.solution0151_ReverseWordsInAString;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by CunjunWang on 2019-09-09.
 */
@Component
public class ReverseWordsInAString {

    public String reverseWords(String s) {
        if (s.isEmpty())
            return s;
        s = s.trim();
        List<String> strList = Arrays.asList(s.split(" "));
        Collections.reverse(strList);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strList.size(); i++) {
            String string = strList.get(i).trim();
            if (!string.isEmpty()) {
                builder.append(string);
                if (i != strList.size() - 1) {
                    builder.append(" ");
                }
            }
        }
        return builder.toString();
    }

}
