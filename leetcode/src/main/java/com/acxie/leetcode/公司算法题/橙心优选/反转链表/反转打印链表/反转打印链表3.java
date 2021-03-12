package com.acxie.leetcode.公司算法题.橙心优选.反转链表.反转打印链表;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * @description: 标准答案
 * @create: 2021/01/17 16:40
 */
public class 反转打印链表3 {


    public static ListNode reverseList(ListNode listNode) {
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
        ListNode temp = reverseList(listNode.next);
        listNode.next.next = listNode;
        listNode.next = null;
        return temp;
    }


    public static void main(String[] args) {
        ListNode node = reverseList(new ListNode(new int[]{1, 2, 3, 4}));
        System.out.println(node);
    }
}
