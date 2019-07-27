package com.cunjunwang.leetcodejava.solutions.solution876_MiddleOfTheLinkedList;

import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-27.
 */
@Component
public class MiddleOfTheLinkedList {

    /**
     * Given a non-empty, singly linked list with head node head,
     * return a middle node of linked list.
     * If there are two middle nodes, return the second middle node.
     * <p>
     * Example 1:
     * Input: [1,2,3,4,5]
     * Output: Node 3 from this list (Serialization: [3,4,5])
     * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
     * Note that we returned a ListNode object ans, such that:
     * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
     * <p>
     * Example 2:
     * Input: [1,2,3,4,5,6]
     * Output: Node 4 from this list (Serialization: [4,5,6])
     * Since the list has two middle nodes with values 3 and 4, we return the second one.
     *
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
