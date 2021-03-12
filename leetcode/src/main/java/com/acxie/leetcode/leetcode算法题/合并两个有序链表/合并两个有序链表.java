package com.acxie.leetcode.leetcode算法题.合并两个有序链表;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * @description:
 * @create: 2020/02/03 13:21
 */
public class 合并两个有序链表 {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode temp;
        if (l1.val > l2.val) {
            temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode reslut = new ListNode(l1.val);
        ListNode otehr = reslut;
        l1 = l1.next;
        while (l1 != null && l2 != null) {
            if (l2.val <= l1.val) {
                otehr.next = new ListNode(l2.val);
                otehr = otehr.next;
                l2 = l2.next;
            } else {
                otehr.next = new ListNode(l1.val);
                otehr = otehr.next;
                l1 = l1.next;
            }
        }


        //
        if (l1 != null) {
            while (l1 != null) {
                otehr.next = new ListNode(l1.val);
                otehr = otehr.next;
                l1 = l1.next;
            }
        }
        if (l2 != null) {
            while (l2 != null) {
                otehr.next = new ListNode(l2.val);
                otehr = otehr.next;
                l2 = l2.next;
            }
        }
        return reslut;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{1, 2, 4});
        ListNode node1 = new ListNode(new int[]{1, 3, 4});
        System.out.println(mergeTwoLists(node, node1));

    }
}
