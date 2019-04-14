package com.cunjunwang.leetcodejava.solutions.solution203_RemoveLinkedListElements;

import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-13.
 */
@Component
public class RemoveLinkedListElements {

    /**
     * Remove all elements from a linked list of integers that have value val.
     * <p>
     * Example:
     * <p>
     * Input:  1->2->6->3->4->5->6, val = 6
     * Output: 1->2->3->4->5
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode curr = head, prev = fakeHead;
        while (head.next != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return fakeHead.next;
    }

}
