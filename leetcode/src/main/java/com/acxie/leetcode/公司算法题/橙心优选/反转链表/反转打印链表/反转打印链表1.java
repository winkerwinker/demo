package com.acxie.leetcode.公司算法题.橙心优选.反转链表.反转打印链表;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * @description:
 * @create: 2021/01/17 16:40
 */
public class 反转打印链表1 {

    public static void reverseList(ListNode listNode) {
        if (listNode == null) {
            return;
        }
        reverseList(listNode.next);
        System.out.println(listNode.val);
    }


    public static void main(String[] args) {
        reverseList(new ListNode(new int[]{1, 2, 3, 4}));
    }
}
