package com.cunjunwang.leetcodejava.solutions.solution0992_SubarraysWithKDifferentIntegers;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by CunjunWang on 2019-10-18.
 */
@Component
public class SubarraysWithKDifferentIntegers {

    // sliding window
    public int subarraysWithKDistinct(int[] A, int K) {
        if (A == null || A.length == 0 || A.length < K)
            return 0;

        Map<Integer, Integer> record = new HashMap<>();
        int distinct = 0;
        int res = 0;
        int i = 0, j = 0;
        while (j < A.length) {
            if (record.getOrDefault(A[j], 0) == 0) {
                distinct++;
            }
            record.put(A[j], 1 + record.getOrDefault(A[i], 0));
            j++;

            // shrink the window left side
            while (i < j && distinct > K) {
                record.put(A[i], record.get(A[i]) - 1);
                if (record.get(A[i]) == 0) {
                    distinct--;
                }
                i++;
            }

            res += j - i;
        }

        return res;
    }

    public static void main(String[] args) {

//        List<Integer> list1 = new LinkedList<>();
//        List<Integer> list2 = new LinkedList<>();
//        List<Integer> list3 = new LinkedList<>();
//        list1.add(1);
//        list1.add(-3);
//        list2.add(1);
//        list2.add(2);
//        list3.add(3);
//        list3.add(4);
//
//        List<List<Integer>> list = new LinkedList<>();
//        list.add(list1);
//        list.add(list2);
//        list.add(list3);
//        int k = 1;
//
//        int[] distance = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            distance[i] = calculate(list.get(i).get(0),
//                    list.get(i).get(1));
//        }
//
//        Arrays.sort(distance);
//        int dist = distance[k - 1];
//
//        Comparator

    }

}
