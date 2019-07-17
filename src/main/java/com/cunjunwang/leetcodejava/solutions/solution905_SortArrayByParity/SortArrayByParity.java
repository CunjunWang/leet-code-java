package com.cunjunwang.leetcodejava.solutions.solution905_SortArrayByParity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-07-17.
 */
@Component
public class SortArrayByParity {

    /**
     * Given an array A of non-negative integers, return an array consisting
     * of all the even elements of A, followed by all the odd elements of A.
     * <p>
     * You may return any answer array that satisfies this condition.
     * <p>
     * Example 1:
     * Input: [3,1,2,4]
     * Output: [2,4,3,1]
     * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     * <p>
     * Note:
     * 1 <= A.length <= 5000
     * 0 <= A[i] <= 5000
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParity(int[] A) {
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            int element = A[i];
            if (element % 2 == 0) {
                evenList.add(element);
            } else {
                oddList.add(element);
            }
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(evenList);
        result.addAll(oddList);
        int[] resultArray = new int[A.length];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

}
