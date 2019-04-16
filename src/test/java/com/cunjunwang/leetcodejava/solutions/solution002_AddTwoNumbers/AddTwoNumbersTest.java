package com.cunjunwang.leetcodejava.solutions.solution002_AddTwoNumbers;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-04-16.
 */
public class AddTwoNumbersTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private AddTwoNumbers addTwoNumbers;

    @Test
    public void addTwoNumbers() {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(9);
        ListNode l24 = new ListNode(1);
        l21.next = l22;
        l22.next = l23;
        l23.next = l24;

        ListNode result = addTwoNumbers.addTwoNumbers(l11, l21);
        logger.info("Result = {}", result);
        Assert.assertEquals(result.val, 7);
        Assert.assertEquals(result.next.val, 0);
        Assert.assertEquals(result.next.next.val, 3);
        Assert.assertEquals(result.next.next.next.val, 2);
        Assert.assertNull(result.next.next.next.next);
    }
}