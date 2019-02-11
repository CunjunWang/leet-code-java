package com.cunjunwang.leetcodejava.solutions.solution760_FindAnagramMappings;

import org.springframework.stereotype.Component;

/**
 * Create by cunjunwang on 2019/2/11
 */
@Component
public class FindAnagramMappings {

    /**
     * Given two lists A and B, and B is an anagram of A. B is an anagram of A means B
     * is made by randomizing the order of the elements in A.
     * <p>
     * We want to find an index mapping P, from A to B. A mapping P[i] = j means the
     * ith element in A appears in B at index j.
     * <p>
     * These lists A and B may contain duplicates. If there are multiple answers, output any of them.
     * <p>
     * For example, given
     * A = [12, 28, 46, 32, 50]
     * B = [50, 12, 32, 46, 28]
     * <p>
     * We should return
     * [1, 4, 3, 2, 0]
     * as P[0] = 1 because the 0th element of A appears at B[1], and P[1] = 4 because the 1st element
     * of A appears at B[4], and so on.
     * <p>
     * Note:
     * A, B have equal lengths in range [1, 100].
     * A[i], B[i] are integers in range [0, 10^5].
     *
     * @param A
     * @param B
     * @return
     */
    public int[] anagramMappings(int[] A, int[] B) {
        int size = A.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (B[j] == A[i]) {
                    result[i] = j;
                    continue;
                }
            }
        }
        return result;
    }

}
