package com.cunjunwang.leetcodejava.solutions.solution0160_IntersectionOfTwoLinkedLists;

import com.cunjunwang.leetcodejava.solutions.CommonObject.LinkedList.ListNode;

/**
 * Created by CunjunWang on 2019-09-21.
 */
public class IntersectionOfTwoLinkedLists {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //boundary check
        if (headA == null || headB == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

}
