package com.cunjunwang.leetcodejava.solutions.solution237_DeleteNodeInALinkedList;

import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-27.
 */
@Component
public class DeleteNodeInALinkedList {

    /**
     * Write a function to delete a node (except the tail) in a singly
     * linked list, given only access to that node.
     * <p>
     * Example 1:
     * Input: head = [4,5,1,9], node = 5
     * Output: [4,1,9]
     * Explanation: You are given the second node with value 5,
     * the linked list should become 4 -> 1 -> 9 after calling your function.
     * <p>
     * Example 2:
     * Input: head = [4,5,1,9], node = 1
     * Output: [4,5,9]
     * Explanation: You are given the third node with value 1, the
     * linked list should become 4 -> 5 -> 9 after calling your function.
     * <p>
     * Note:
     * The linked list will have at least two elements.
     * All of the nodes' values will be unique.
     * The given node will not be the tail and it will always be a valid node of the linked list.
     * Do not return anything from your function.
     *
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode delNode = node.next;
        node.next = node.next.next;
        delNode.next = null;
    }

}
