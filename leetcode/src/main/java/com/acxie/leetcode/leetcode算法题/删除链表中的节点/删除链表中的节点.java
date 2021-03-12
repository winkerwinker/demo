package com.acxie.leetcode.leetcode算法题.删除链表中的节点;


import com.acxie.leetcode.struct.listnode.ListNode;

public class 删除链表中的节点 {

    public static void deleteNode(ListNode node) {

//        node.val=node.next.val;
//        node.next=node.next.next;
        node = node.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{4, 5, 1, 9});
        删除链表中的节点.deleteNode(node);
        System.out.println(node);
    }
}
