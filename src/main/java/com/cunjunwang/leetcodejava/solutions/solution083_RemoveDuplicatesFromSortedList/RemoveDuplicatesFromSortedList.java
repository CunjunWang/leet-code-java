package com.cunjunwang.leetcodejava.solutions.solution083_RemoveDuplicatesFromSortedList;

import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-19.
 */
@Component
public class RemoveDuplicatesFromSortedList {

    /**
     * Given a sorted linked list, delete all duplicates such that
     * each element appear only once.
     * <p>
     * Example 1:
     * Input: 1->1->2
     * Output: 1->2
     * <p>
     * Example 2:
     * Input: 1->1->2->3->3
     * Output: 1->2->3
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

}
