package com.cunjunwang.leetcodejava.solutions.solution019_RemoveNthNodeFromEndOfList;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-08.
 */
public class RemoveNthNodeFromEndOfListTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList;

    @Test
    public void removeNthFromEnd() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);
        logger.info("result = {}", listNode);
    }
}