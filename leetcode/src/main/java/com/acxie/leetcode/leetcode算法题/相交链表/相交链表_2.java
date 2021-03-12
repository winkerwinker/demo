package com.acxie.leetcode.leetcode算法题.相交链表;


import com.acxie.leetcode.struct.listnode.ListNode;
import org.junit.Test;


/**
 * 双指针法
 */
public class 相交链表_2 {


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode otherA = headA;
        ListNode otherB = headB;
        int flagA = 0;
        int flagB = 0;
        while (otherA != null&&otherB != null) {
            if (otherA==otherB){
                return otherA;
            }
            otherA = otherA.next;
            otherB = otherB.next;
            if (otherA == null && flagA == 0) {
                flagA++;
                otherA=headB;
            }
            if (otherB == null && flagB == 0) {
                flagB++;
                otherB=headA;
            }
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
