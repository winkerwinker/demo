package com.acxie.leetcode.leetcode算法题.相交链表;


import com.acxie.leetcode.struct.listnode.ListNode;
import org.junit.Test;

import java.util.ArrayList;


/**
 * 哈希表法 存储地址
 */
public class 相交链表_1 {


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode otherA = headA;
        ListNode otherB = headB;
        ArrayList<ListNode> table = new ArrayList<ListNode>();
        while (otherA != null) {
            table.add(otherA);
            otherA = otherA.next;
        }

        while (otherB != null) {
            if (table.contains(otherB)) {
                return otherB;
            }
            otherB = otherB.next;
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
