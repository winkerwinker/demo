package com.acxie.leetcode.剑指offer.链表中倒数第k个节点;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/10 10:59
 */

//双指针求解
public class 链表中倒数第k个节点_双指针求解 {

    public static ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode first = head;
        ListNode sencond = head;
        while (--k > 0) {
            first = first.next;
        }
        //first
        while (first.next != null) {
            first = first.next;
            sencond = sencond.next;
        }
        return sencond;
    }

    public static void main(String[] args) {
        ListNode a = getKthFromEnd(new ListNode(new int[]{}), 1);
        System.out.println(a);
    }
}
