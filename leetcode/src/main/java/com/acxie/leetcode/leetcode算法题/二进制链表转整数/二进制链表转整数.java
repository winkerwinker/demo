package com.acxie.leetcode.leetcode算法题.二进制链表转整数;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * @description:
 * @create: 2020/02/03 20:58
 */
public class 二进制链表转整数 {


    public static int getDecimalValue(ListNode head) {
        int temp = 0;
        while (head != null) {
            temp = (temp << 1) + head.val;
            head = head.next;
        }

        return temp;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(new int[]{});
        System.out.println(getDecimalValue(node1));
    }
}
