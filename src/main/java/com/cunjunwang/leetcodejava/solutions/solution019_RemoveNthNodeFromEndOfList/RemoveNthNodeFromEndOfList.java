package com.cunjunwang.leetcodejava.solutions.solution019_RemoveNthNodeFromEndOfList;

import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class RemoveNthNodeFromEndOfList {

    /**
     * Given a linked list, remove the n-th node from the end of list
     * and return its head.
     * <p>
     * Example:
     * Given linked list: 1->2->3->4->5, and n = 2.
     * After removing the second node from the end, the linked list
     * becomes 1->2->3->5.
     * <p>
     * Note:
     * Given n will always be valid.
     * <p>
     * Follow up:
     * Could you do this in one pass?
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size == n) {
            head = head.next;
            return head;
        }
        temp = head;
        int cur = 0;
        while (cur < size - n - 1) {
            cur++;
            temp = temp.next;
        }
        ListNode delNode = temp.next;
        temp.next = delNode.next;
        delNode.next = null;
        return head;
    }

}
