package com.acxie.leetcode.leetcode算法题.相交链表;

import com.acxie.leetcode.struct.listnode.ListNode;
import org.junit.Test;


public class 相交链表 {


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode otherA = headA;

        while (otherA != null) {
            ListNode otherB = headB;
            while (otherB != null) {
                //System.out.println(otherB.val);
                if (otherA == otherB) {
                    return otherA;
                }
                otherB = otherB.next;
            }
            otherA = otherA.next;
        }


        return null;
    }

    @Test
    public void test() {
        ListNode listNode = new ListNode(new int[]{4, 1, 8, 4, 5});
        ListNode listNode1 = new ListNode(new int[]{5, 0, 1});
        listNode1.next.next.next = listNode.next.next;
        System.out.println(listNode);
        System.out.println(listNode1);
        System.out.println(getIntersectionNode(listNode, listNode1).val);
    }
}
