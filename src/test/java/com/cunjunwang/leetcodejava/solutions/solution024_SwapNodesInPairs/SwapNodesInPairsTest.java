package com.cunjunwang.leetcodejava.solutions.solution024_SwapNodesInPairs;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-08-09.
 */
public class SwapNodesInPairsTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private SwapNodesInPairs swapNodesInPairs;

    @Test
    public void swapPairs() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        ListNode listNode = swapNodesInPairs.swapPairs(head);
        logger.info("result = {}", listNode);
    }
}