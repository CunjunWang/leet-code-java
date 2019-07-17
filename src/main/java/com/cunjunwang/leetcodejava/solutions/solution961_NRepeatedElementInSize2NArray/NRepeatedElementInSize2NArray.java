package com.cunjunwang.leetcodejava.solutions.solution961_NRepeatedElementInSize2NArray;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-07-17.
 */
@Component
public class NRepeatedElementInSize2NArray {

    /**
     * In a array A of size 2N, there are N+1 unique elements,
     * and exactly one of these elements is repeated N times.
     * Return the element repeated N times.
     * <p>
     * Example 1:
     * Input: [1,2,3,3]
     * Output: 3
     * <p>
     * Example 2:
     * Input: [2,1,2,5,3,2]
     * Output: 2
     * <p>
     * Example 3:
     * Input: [5,1,5,2,5,3,5,4]
     * Output: 5
     * <p>
     * Note:
     * 4 <= A.length <= 10000
     * 0 <= A[i] < 10000
     * A.length is even
     *
     * @param A
     * @return
     */
    public int repeatedNTimes(int[] A) {
        List<Integer> visited = new ArrayList<>();
        int result = A[0];
        for (int i = 0; i < A.length; i++) {
            if (!visited.contains(A[i])) {
                visited.add(A[i]);
            } else {
                result = A[i];
                break;
            }
        }
        return result;
    }

}
