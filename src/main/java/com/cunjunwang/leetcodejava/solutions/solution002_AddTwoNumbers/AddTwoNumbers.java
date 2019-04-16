package com.cunjunwang.leetcodejava.solutions.solution002_AddTwoNumbers;

import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-16.
 */
@Component
public class AddTwoNumbers {

    private int carry = 0;

    /**
     * You are given two non-empty linked lists representing two
     * non-negative integers. The digits are stored in reverse order
     * and each of their nodes contain a single digit. Add the two
     * numbers and return it as a linked list.
     * <p>
     * You may assume the two numbers do not contain any leading zero,
     * except the number 0 itself.
     * <p>
     * Example:
     * <p>
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = carry;
        if (l1 == null && l2 == null) {
            if (carry == 0) {
                return null;
            } else {
                return new ListNode(carry);
            }
        }
        if (l1 != null) {
            sum = sum + l1.val;
        }
        if (l2 != null) {
            sum = sum + l2.val;
        }
        int newVal = sum % 10;
        carry = sum >= 10 ? 1 : 0;
        ListNode node = new ListNode(newVal);
        node.next = addTwoNumbers(l1 == null ? null : l1.next, l2 == null ? null : l2.next);
        return node;
    }

}
