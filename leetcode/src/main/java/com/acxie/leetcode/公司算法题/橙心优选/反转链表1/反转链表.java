package com.acxie.leetcode.公司算法题.橙心优选.反转链表1;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * @description:
 * @create: 2021/01/17 16:40
 * <p>
 * <p>
 * <p>
 * 修订次数
 * 1.造成的空指针
 * if (head == null) {
 * return head;
 * }
 * <p>
 * 2.
 * //todo
 * listNode.next = head;
 * <p>
 * <p>
 * <p>
 * todo
 */
public class 反转链表 {
    static ListNode end;

    public static ListNode reverseList(ListNode head, int m, int n) {
        //一直到m
        ListNode reverseHead = head;
        //找到他的前一个位置、并且保存
        while (reverseHead.next != null && m-- >= 0) {
            reverseHead = reverseHead.next;
        }
        ListNode listNode = reverseList(reverseHead);
        head.next = listNode;
        listNode.next = end;
        return head;
    }

    public static ListNode reverseList(ListNode head) {
        // 保存一个全局的尾部Node
        if (head.next == null) {
            return head;
        }
        ListNode listNodes = reverseList(head);
        //todo while 、用于保持尾部
        head.next.next = head;
        head.next = null;
        return listNodes;
    }

    public static void main(String[] args) {
        // 6 5 4 3 2,其中head.next = 2 ,那么要接入2的尾部；
        // ListNode listNode = new ListNode(new int[]{2, 3, 4, 5});
        ListNode listNode = new ListNode(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(listNode);

        ListNode node = reverseList(listNode, 2, 4);
        System.out.println(node);

    }

}
