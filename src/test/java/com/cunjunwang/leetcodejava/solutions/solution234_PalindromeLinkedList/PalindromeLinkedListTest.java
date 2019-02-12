package com.cunjunwang.leetcodejava.solutions.solution234_PalindromeLinkedList;

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
public class PalindromeLinkedListTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private PalindromeLinkedList palindromeLinkedList;

    @Test
    public void isPalindrome() {
        logger.info("测试开始");
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Boolean result = palindromeLinkedList.isPalindrome(head);
        logger.info("测试结束, 结果: {}", result);
    }
}