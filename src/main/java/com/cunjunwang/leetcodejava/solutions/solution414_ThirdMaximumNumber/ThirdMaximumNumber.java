package com.cunjunwang.leetcodejava.solutions.solution414_ThirdMaximumNumber;

import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by CunjunWang on 2019-07-18.
 */
@Component
public class ThirdMaximumNumber {

    /**
     * Given a non-empty array of integers, return the third maximum
     * number in this array. If it does not exist, return the maximum
     * number. The time complexity must be in O(n).
     * <p>
     * Example 1:
     * Input: [3, 2, 1]
     * Output: 1
     * Explanation: The third maximum is 1.
     * <p>
     * Example 2:
     * Input: [1, 2]
     * Output: 2
     * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
     * <p>
     * Example 3:
     * Input: [2, 2, 3, 1]
     * Output: 1
     * Explanation: Note that the third maximum here means the third maximum distinct number.
     * Both numbers with value 2 are both considered as second maximum
     *
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer a, Integer b) {
                        if (a > b) {
                            return -1;
                        } else if (a.equals(b)) {
                            return 0;
                        } else {
                            return 1;
                        }
                    }
                }
        );
        for (int num : nums) {
            if (!priorityQueue.contains(num)) {
                priorityQueue.add(num);
            }
        }
        if (priorityQueue.size() <= 2) {
            return priorityQueue.peek();
        }
        for (int i = 0; i < 2; i++) {
            priorityQueue.remove(priorityQueue.peek());
        }
        return priorityQueue.peek();
    }
}
