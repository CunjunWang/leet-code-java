package com.cunjunwang.leetcodejava.solutions.solution141_LinkedListCycle;

import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.springframework.stereotype.Component;

/**
 * Create by cunjunwang on 2019/2/12
 */
@Component
public class LinkedListCycle {

    /**
     * Given a linked list, determine if it has a cycle in it.
     * <p>
     * To represent a cycle in the given linked list, we use an integer pos which
     * represents the position (0-indexed) in the linked list where tail connects to.
     * If pos is -1, then there is no cycle in the linked list.
     * <p>
     * Example 1:
     * <p>
     * Input: head = [3,2,0,-4], pos = 1
     * Output: true
     * Explanation: There is a cycle in the linked list, where tail connects to the second node.
     * <p>
     * <p>
     * Example 2:
     * <p>
     * Input: head = [1,2], pos = 0
     * Output: true
     * Explanation: There is a cycle in the linked list, where tail connects to the first node.
     * <p>
     * <p>
     * Example 3:
     * <p>
     * Input: head = [1], pos = -1
     * Output: false
     * Explanation: There is no cycle in the linked list.
     * <p>
     * <p>
     * Follow up:
     * <p>
     * Can you solve it using O(1) (i.e. constant) memory?
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
