package com.acxie.leetcode.leetcode算法题.合并两个有序链表;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * @description:递归
 * @create: 2020/02/03 13:21
 */
public class 合并两个有序链表_1 {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }


    }

    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{1, 2, 4});
        ListNode node1 = new ListNode(new int[]{1, 3, 4});
        System.out.println(mergeTwoLists(node, node1));

    }
}
