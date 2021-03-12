package com.acxie.leetcode.公司算法题.橙心优选.反转链表.反转链表;


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
 * todo star
 */
public class 反转链表1 {

    public static ListNode reverseList(ListNode head) {

        if (head.next == null) {
            return head;
        }
        ListNode newNode = reverseList(head.next);
        //  todo 作为核心
        head.next.next = head;
        head.next = null;
        return newNode;

    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(listNode);

        ListNode node = reverseList(listNode);
        System.out.println(node);

    }

}
