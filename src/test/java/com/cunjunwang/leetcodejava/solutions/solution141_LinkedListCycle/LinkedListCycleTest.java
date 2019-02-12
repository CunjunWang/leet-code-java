package com.cunjunwang.leetcodejava.solutions.solution141_LinkedListCycle;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create by cunjunwang on 2019/2/12
 */
public class LinkedListCycleTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private LinkedListCycle linkedListCycle;

    @Test
    public void hasCycle() {
        logger.info("开始测试");

        ListNode head1 = new ListNode(3);
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(0);
        ListNode node13 = new ListNode(-4);
        head1.next = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node11;
        boolean result1 = linkedListCycle.hasCycle(head1);
        Assert.assertTrue(result1);

        ListNode head2 = new ListNode(1);
        ListNode node21 = new ListNode(2);
        head2.next = node21;
        node21.next = head2;
        boolean result2 = linkedListCycle.hasCycle(head2);
        Assert.assertTrue(result2);

        ListNode head3 = new ListNode(1);
        boolean result3 = linkedListCycle.hasCycle(head3);
        Assert.assertFalse(result3);

        ListNode head4 = new ListNode(2);
        ListNode node41 = new ListNode(3);
        ListNode node42 = new ListNode(4);
        head4.next = node41;
        node41.next = node42;
        boolean result4 = linkedListCycle.hasCycle(head4);
        Assert.assertFalse(result4);

        logger.info("测试结束");
    }
}