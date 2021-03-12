package com.acxie.leetcode.leetcode算法题.删除链表的倒数第N个节点;


import com.acxie.leetcode.struct.listnode.ListNode;

public class 删除链表的倒数第N个节点 {
    /**
     * @param head
     * @param n
     * @return 计算总长度
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        int count = 1;
        ListNode fakehead = head;
        while (fakehead.next != null) {
            count++;
            fakehead = fakehead.next;
        }

        int real = count - n + 1;
        if (real == 1) {
            head = head.next;
        } else {
            fakehead = head;
            while (fakehead.next != null) {
                if (--real == 1) {
                    fakehead.next = fakehead.next.next;
                    break;
                }
                fakehead = fakehead.next;
            }

        }
        return head;
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{1, 2, 3, 4, 5});
        System.out.println(node);
        删除链表的倒数第N个节点.removeNthFromEnd(node, 2);
        System.out.println(node);
    }
}
