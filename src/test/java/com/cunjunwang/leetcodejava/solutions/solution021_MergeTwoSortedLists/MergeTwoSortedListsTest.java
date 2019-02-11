package com.cunjunwang.leetcodejava.solutions.solution021_MergeTwoSortedLists;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/11
 */
public class MergeTwoSortedListsTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private MergeTwoSortedLists mergeTwoSortedLists;

    @Test
    public void mergeTwoLists() {
        logger.info("测试开始");
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(2);
        ListNode l23 = new ListNode(4);
        ListNode l24 = new ListNode(6);
        l21.next = l22;
        l22.next = l23;
        l23.next = l24;

        logger.info("List 1: {}", l11.toString());
        logger.info("List 2: {}", l21.toString());

        ListNode result = mergeTwoSortedLists.mergeTwoLists(l11, l21);
        logger.info("测试完毕, 结果: {}", result.toString());
    }
}