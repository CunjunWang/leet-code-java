package com.cunjunwang.leetcodejava.solutions.solution346_MovingAverageFromDataStream;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by CunjunWang on 2019-04-25.
 */
public class MovingAverage {

    private LimitQueue limitQueue;

    /**
     * Given a stream of integers and a window size, calculate
     * the moving average of all integers in the sliding window.
     * <p>
     * Example:
     * <p>
     * MovingAverage m = new MovingAverage(3);
     * m.next(1) = 1
     * m.next(10) = (1 + 10) / 2
     * m.next(3) = (1 + 10 + 3) / 3
     * m.next(5) = (10 + 3 + 5) / 3
     */
    public MovingAverage(int size) {
        this.limitQueue = new LimitQueue(size);
    }

    public double next(int val) {
        limitQueue.add(val);
        double sum = limitQueue.sum();
        double length = limitQueue.size();
        return (float) sum / length;
    }

    private class LimitQueue {

        private int size;

        private Queue<Integer> queue = new LinkedList<>();

        public LimitQueue(int size) {
            this.size = size;
        }

        public double size() {
            return queue.size();
        }

        public boolean isEmpty() {
            return queue.size() == 0;
        }

        public boolean add(Integer i) {
            if (queue.size() >= size) {
                queue.poll();
            }
            return queue.offer(i);
        }

        public double sum() {
            int sum = 0;
            for (int i : queue) {
                sum = sum + i;
            }
            return sum;
        }
    }

}
