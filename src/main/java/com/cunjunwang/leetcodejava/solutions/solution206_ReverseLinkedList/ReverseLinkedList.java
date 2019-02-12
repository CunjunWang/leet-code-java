package com.cunjunwang.leetcodejava.solutions.solution206_ReverseLinkedList;

import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.springframework.stereotype.Component;

/**
 * Create by cunjunwang on 2019/2/11
 */
@Component
public class ReverseLinkedList {

    /**
     * Reverse a singly linked list.
     * <p>
     * Example:
     * <p>
     * Input: 1->2->3->4->5->NULL
     * Output: 5->4->3->2->1->NULL
     * Follow up:
     * <p>
     * A linked list can be reversed either iteratively or recursively.
     * Could you implement both?
     *
     * @param head
     * @return
     */
    public ListNode reverseListIteratively(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = new ListNode(head.val);
        while(head.next != null) {
            head = head.next;
            ListNode node = new ListNode(head.val);
            node.next = result;
            result = node;
        }
        return result;
    }

    public ListNode reverseListRecursively(ListNode head) {
        return null;
    }
}
