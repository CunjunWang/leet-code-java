package com.cunjunwang.leetcodejava.solutions.solution716_MaxStack;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * Created by CunjunWang on 2019-04-04.
 */
@Component
public class MaxStack {

    private Stack<Integer> stack;
    private Stack<Integer> maxStack;

    /**
     * Design a max stack that supports push, pop, top, peekMax and popMax.
     * <p>
     * push(x) -- Push element x onto stack.
     * pop() -- Remove the element on top of the stack and return it.
     * top() -- Get the element on the top.
     * peekMax() -- Retrieve the maximum element in the stack.
     * popMax() -- Retrieve the maximum element in the stack, and remove it.
     * If you find more than one maximum elements, only remove the top-most one.
     * <p>
     * Example 1:
     * MaxStack stack = new MaxStack();
     * stack.push(5);
     * stack.push(1);
     * stack.push(5);
     * stack.top(); -> 5
     * stack.popMax(); -> 5
     * stack.top(); -> 1
     * stack.peekMax(); -> 5
     * stack.pop(); -> 1
     * stack.top(); -> 5
     * <p>
     * Note:
     * -1e7 <= x <= 1e7
     * Number of operations won't exceed 10000.
     * The last four operations won't be called when stack is empty.
     */
    public MaxStack() {
        this.stack = new Stack<>();
        this.maxStack = new Stack<>();
    }

    public void push(int x) {
        int max = maxStack.isEmpty() ? x : maxStack.peek();
        stack.push(x);
        maxStack.push(max > x ? max : x);
    }

    public int pop() {
        maxStack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        int max = peekMax();
        Stack<Integer> buffer = new Stack<>();
        while (top() != max) {
            buffer.push(pop());
        }
        pop();
        while (!buffer.isEmpty()) {
            push(buffer.pop());
        }
        return max;
    }
}
