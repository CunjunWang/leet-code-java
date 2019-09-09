package com.cunjunwang.leetcodejava.solutions.solution024_SwapNodesInPairs;

import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-09.
 */
@Component
public class SwapNodesInPairs {

    /**
     * Given a linked list, swap every two adjacent nodes
     * and return its head.
     * You may not modify the values in the list's nodes,
     * only nodes itself may be changed.
     * <p>
     * Example:
     * Given 1->2->3->4, you should return the list as 2->1->4->3.
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        head = head.next;
        while (temp != null && temp.next != null) {
            ListNode next = temp.next;
            temp.next = next.next;
            next.next = temp;
            temp = temp.next.next;
        }
        return head;
    }

}
