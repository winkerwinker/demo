package com.acxie.leetcode.leetcode算法题.反转链表;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * @description:
 * @create: 2020/02/01 22:25
 */
public class 反转链表_1 {
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？

    /**
     * 错误解答 反转思路错误
     * @param head
     * @return
     */

    public static ListNode reverseList(ListNode head) {
        //得到len后每次都插到末尾
        int len = 0;
        ListNode other = head;
        while (other != null) {
            len++;
            other = other.next;
        }
        int reallen = len;
        System.out.println(head);
        while (--reallen > 0) {
            int end = head.val;
            ListNode temp = head;

            for (int i = 0; i < len-1; i++) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = new ListNode(end);
            System.out.println(head);
        }

        return head;
    }


    public static void main(String[] args) {
        ListNode a = reverseList(new ListNode(new int[]{1, 2, 3, 4}));
        System.out.println(a);
    }
}


//    //TODO 连成环
//    public static void addTo(data_structure.ListNode head, int len) {//5
//        int end = head.val;
//
//        data_structure.ListNode other = head;
//        while (--len > 0) {
//            other = other.next;
//        }
//
//        //TODO
//        head = head.next;
//        head = new data_structure.ListNode(88);
//        other.next = new data_structure.ListNode(end);
//
//    }