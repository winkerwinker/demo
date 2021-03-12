package com.acxie.leetcode.剑指offer.链表中倒数第k个节点;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/10 10:59
 */

//双指针求解
public class 链表中倒数第k个节点_双指针求解_官方题解 {

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        //第一个指针先走k步
        while (k-- > 0) {
            first = first.next;
        }
        //然后两个指针在同时前进
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second;

    }

    public static void main(String[] args) {
        ListNode a = getKthFromEnd(new ListNode(new int[]{}), 1);
        System.out.println(a);
    }
}
