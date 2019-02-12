package com.cunjunwang.leetcodejava.solutions.solution206_ReverseLinkedList;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/12
 */
public class ReverseLinkedListTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private ReverseLinkedList reverseLinkedList;

    @Test
    public void reverseListIteratively() {
        logger.info("测试开始");
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode result = reverseLinkedList.reverseListIteratively(head);
        logger.info("测试结束, 结果: {}", result.toString());
    }

    @Test
    public void reverseListRecursively() {
    }
}