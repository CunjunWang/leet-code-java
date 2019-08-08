package com.cunjunwang.leetcodejava.solutions.solution225_ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by CunjunWang on 2019-08-08.
 */
public class MyStack {

    private Queue<Integer> data;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        this.data = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        data.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        Queue<Integer> temp = new LinkedList<>();
        int size = data.size();
        for (int i = 0; i < size - 1; i++) {
            temp.add(data.poll());
        }
        int result = data.remove();
        data.addAll(temp);
        return result;
    }

    /**
     * Get the top element.
     */
    public int top() {
        List<Integer> temp = new LinkedList<>();
        int size = data.size();
        for (int i = 0; i < size; i++) {
            temp.add(data.remove());
        }
        int result = temp.get(temp.size() - 1);
        data.addAll(temp);
        return result;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return data.isEmpty();
    }

}
