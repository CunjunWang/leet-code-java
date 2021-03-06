package com.cunjunwang.leetcodejava.solutions.solution203_RemoveLinkedListElements;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-04-13.
 */
public class RemoveLinkedListElementsTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private RemoveLinkedListElements removeLinkedListElements;

    @Test
    public void removeElements() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        ListNode result = removeLinkedListElements.removeElements(node1, 6);
        logger.info("result = {}", result);
    }

}