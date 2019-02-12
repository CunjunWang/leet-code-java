package com.cunjunwang.leetcodejava.solutions.solution234_PalindromeLinkedList;

import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import com.cunjunwang.leetcodejava.solutions.solution206_ReverseLinkedList.ReverseLinkedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Create by cunjunwang on 2019/2/12
 */
@Component
public class PalindromeLinkedList {

    @Autowired
    private ReverseLinkedList reverseLinkedList;

    /**
     * Given a singly linked list, determine if it is a palindrome.
     * <p>
     * Example 1:
     * <p>
     * Input: 1->2
     * Output: false
     * Example 2:
     * <p>
     * Input: 1->2->2->1
     * Output: true
     * <p>
     * Follow up:
     * Could you do it in O(n) time and O(1) space?
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // odd nodes: let right half smaller
        if (fast != null) {
            slow = slow.next;
        }
        // slow = reverseLinkedList.reverseListIteratively(slow);
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
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

}
