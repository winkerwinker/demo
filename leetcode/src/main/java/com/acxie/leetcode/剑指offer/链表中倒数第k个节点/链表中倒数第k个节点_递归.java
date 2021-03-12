package com.acxie.leetcode.剑指offer.链表中倒数第k个节点;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/10 10:59
 */

//递归！！！！！
public class 链表中倒数第k个节点_递归 {


    //全局变量，记录递归往回走的时候访问的结点数量
    int size;

    public static void main(String[] args) {
        ListNode a = new 链表中倒数第k个节点_递归().getKthFromEnd(new ListNode(new int[]{1, 2, 3, 4, 5}), 1);
        System.out.println(a.val);
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode node = getKthFromEnd(head.next, k);
        ++size;
        if (size > k) {
            return node;
        } else if (size == k) {
            return head;
        } else {
            return null;
        }
    }
}
