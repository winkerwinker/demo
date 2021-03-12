package com.acxie.leetcode.公司算法题.橙心优选.反转链表.部分反转链表;


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
public class 部分反转链表 {

    static int count = 0;
    static ListNode endNode = null;

    public static ListNode reverseList(ListNode head, int m, int n) {
        ListNode index = head;
        ListNode fromEnd;
        while (m > 1) {
            m--;
            n--;
            index = index.next;
        }
        fromEnd = index;


        count = n - m + 1;

        ListNode node = reverseList(index);

        fromEnd.next = node;
        while (node.next != null) {
            node = node.next;
        }
        node.next = endNode;
        return head;


    }

    public static ListNode reverseList(ListNode head) {


        if (head == null || head.next == null) {
            return head;
        }
        if (count == 0) {
            endNode = head;
            return null;
        }

        count--;
        ListNode listNode = reverseList(head.next);
        //不要改变原始的 参数
        head.next = null;

        //todo
        ListNode end = listNode;
        while (end.next != null) {
            end = end.next;
        }

        end.next = head;

        return listNode;
    }

    public static void main(String[] args) {
        // ListNode listNode = new ListNode(new int[]{2, 3, 4, 5});
        ListNode listNode = new ListNode(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(listNode);

        ListNode node = reverseList(listNode, 2, 4);
        System.out.println(node);

    }

}
