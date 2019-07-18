package com.cunjunwang.leetcodejava.solutions.solution707_DesignLinkedList;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by CunjunWang on 2019-07-18.
 */
public class MyLinkedListTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(MyLinkedListTest.class);

    @Test
    public void testLinkedList() {
        MyLinkedList linkedList = new MyLinkedList();
//        logger.info("list = {}", linkedList);
//
//        int at0 = linkedList.get(0);
//        logger.info("ele at 0 = {}", at0);
//
//        int at1 = linkedList.get(1);
//        logger.info("ele at 1 = {}", at1);
//
//        linkedList.addAtHead(5);
//        logger.info("list = {}", linkedList);
//
//        linkedList.addAtIndex(2, 6);
//        logger.info("list = {}", linkedList);
//
//        linkedList.addAtIndex(5, 7);
//        logger.info("list = {}", linkedList);
//
//        linkedList.addAtTail(7);
//        logger.info("list = {}", linkedList);
//
//        int atTail = linkedList.get(4);
//        logger.info("ele at 4 = {}", atTail);
//
//        int at3 = linkedList.get(3);
//        logger.info("ele at 3 = {}", at3);
//
//        linkedList.deleteAtIndex(10);
//
//        linkedList.deleteAtIndex(0);
//        logger.info("list = {}", linkedList);

        linkedList.addAtIndex(0, 10);
        logger.info("list = {}", linkedList);

        linkedList.addAtIndex(0, 20);
        logger.info("list = {}", linkedList);

        linkedList.addAtIndex(1, 30);
        logger.info("list = {}", linkedList);

        int at0 = linkedList.get(0);
        logger.info("at 0 = {}", at0);

    }

}