package com.cunjunwang.leetcodejava.solutions.solution155_MinStack;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * Created by CunjunWang on 2019-04-08.
 */
@Component
public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;


    /**
     * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
     * <p>
     * push(x) -- Push element x onto stack.
     * pop() -- Removes the element on top of the stack.
     * top() -- Get the top element.
     * getMin() -- Retrieve the minimum element in the stack.
     * <p>
     * Example:
     * MinStack minStack = new MinStack();
     * minStack.push(-2);
     * minStack.push(0);
     * minStack.push(-3);
     * minStack.getMin();   --> Returns -3.
     * minStack.pop();
     * minStack.top();      --> Returns 0.
     * minStack.getMin();   --> Returns -2.
     */
    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        int min = minStack.isEmpty() ? x : minStack.peek();
        minStack.push(min < x ? min : x);
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
