package com.cunjunwang.leetcodejava.solutions.solution232_ImplementQueueUsingStacks;

import java.util.Stack;

/**
 * Created by CunjunWang on 2019-08-08.
 */
public class MyQueue {

    private Stack<Integer> data;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        this.data = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        data.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        int size = data.size();
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < size - 1; i++) {
            temp.push(data.pop());
        }
        int result = data.pop();
        int tempSize = temp.size();
        for (int i = 0; i < tempSize; i++) {
            data.push(temp.pop());
        }
        return result;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        int size = data.size();
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < size; i++) {
            temp.push(data.pop());
        }
        int result = temp.peek();
        for (int i = 0; i < size; i++) {
            data.push(temp.pop());
        }
        return result;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return this.data.isEmpty();
    }
}