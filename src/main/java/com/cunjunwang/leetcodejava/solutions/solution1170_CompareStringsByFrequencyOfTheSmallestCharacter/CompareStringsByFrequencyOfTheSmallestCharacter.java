package com.cunjunwang.leetcodejava.solutions.solution1170_CompareStringsByFrequencyOfTheSmallestCharacter;

import java.util.Arrays;

/**
 * Created by CunjunWang on 2019-10-30.
 */
public class CompareStringsByFrequencyOfTheSmallestCharacter {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] queryCount = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            queryCount[i] = f(queries[i]);
        }

        int[] wordCount = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wordCount[i] = f(words[i]);
        }

        Arrays.sort(wordCount);

        int[] res = new int[queries.length];
        for (int i = 0; i < queryCount.length; i++) {
            int left = 0;
            int right = wordCount.length - 1;
            int count = 0;

            while (left <= right) {
                int mid = left + (right -left) / 2;
                if (wordCount[mid] <= queryCount[i]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            count = wordCount.length - left;

            res[i] = count;
        }

        return res;
    }

    private int f(String s) {
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (map[i] > 0) {
                return map[i];
            }
        }

        return 0;
    }

}
