package com.cunjunwang.leetcodejava.solutions.solution083_RemoveDuplicatesFromSortedList;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-19.
 */
public class RemoveDuplicatesFromSortedListTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(RemoveDuplicatesFromSortedListTest.class);

    @Autowired
    private RemoveDuplicatesFromSortedList removeDuplicatesFromSortedArray;

    @Test
    public void deleteDuplicates() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode listNode = removeDuplicatesFromSortedArray.deleteDuplicates(head);
        logger.info("result = {}", listNode);

        head = new ListNode(1);
        node1 = new ListNode(1);
        node2 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        listNode = removeDuplicatesFromSortedArray.deleteDuplicates(head);
        logger.info("result = {}", listNode);
    }
}