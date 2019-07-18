package com.cunjunwang.leetcodejava.solutions.solution707_DesignLinkedList;

import lombok.ToString;

/**
 * Created by CunjunWang on 2019-07-18.
 */
@ToString
public class MyLinkedList {

    @ToString
    private class LinkedListNode {
        public int val;
        public LinkedListNode next;

        public LinkedListNode(int x) {
            val = x;
            next = null;
        }
    }

    private LinkedListNode head = null;
    private int length;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        this.length = 0;
    }

    /**
     * Get the value of the index-th node in the linked list.
     * If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }
        LinkedListNode pointer = head;
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        return pointer.val;
    }

    /**
     * Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        LinkedListNode node = new LinkedListNode(val);
        node.next = head;
        head = node;
        length = length + 1;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        LinkedListNode node = new LinkedListNode(val);
        LinkedListNode pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = node;
        length = length + 1;
    }

    /**
     * Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list, the node will be appended
     * to the end of linked list. If index is greater than the length, the node
     * will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        if (index > length) {
            return;
        }
        LinkedListNode node = new LinkedListNode(val);
        LinkedListNode pointer = head;
        for (int i = 0; i < index - 1; i++) {
            pointer = pointer.next;
        }
        node.next = pointer.next;
        pointer.next = node;
        length = length + 1;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) {
            return;
        }
        if (index == 0) {
            head = head.next;
            length = length - 1;
            return;
        }
        LinkedListNode pointer = head;
        for (int i = 0; i < index - 1; i++) {
            pointer = pointer.next;
        }
        pointer.next = pointer.next.next;
        length = length - 1;
    }

}
