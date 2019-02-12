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
        while (head.next != null) {
            head = head.next;
            ListNode node = new ListNode(head.val);
            node.next = result;
            result = node;
        }
        return result;
    }

    public ListNode reverseListRecursively(ListNode head) {
        // TODO:
        return null;
    }

    /**
     * Approach #1 (Iterative) [Accepted]
     * Assume that we have linked list 1 → 2 → 3 → Ø, we would like to change it to Ø ← 1 ← 2 ← 3.
     * <p>
     * While you are traversing the list, change the current node's next pointer to
     * point to its previous element. Since a node does not have reference to its
     * previous node, you must store its previous element beforehand.
     * You also need another pointer to store the next node before changing the reference.
     * Do not forget to return the new head reference at the end!
     * <p>
     * Complexity analysis
     * <p>
     * Time complexity : O(n). Assume that n is the list's length, the time complexity is O(n).
     * <p>
     * Space complexity : O(1).
     *
     * @param head
     * @return
     */
    public ListNode reverseListSolutionIteratively(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextTemp;
        while (curr != null) {
            nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
