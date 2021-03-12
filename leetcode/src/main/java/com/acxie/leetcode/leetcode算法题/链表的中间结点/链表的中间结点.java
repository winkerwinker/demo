package com.acxie.leetcode.leetcode算法题.链表的中间结点;


import com.acxie.leetcode.struct.listnode.ListNode;

public class 链表的中间结点 {


//    public static data_structure.ListNode middleNode(data_structure.ListNode head) {
//        data_structure.ListNode[] A = new data_structure.ListNode[100];
//        int t = 0;
//        while (head.next != null) {
//            A[t++] = head;
//            //但是t会++
//            head = head.next;
//        }
//        System.out.println(t);
//        System.out.println(Arrays.toString(A));
//          return A[t / 2];
//    }


    public static ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        A[t++] = head;
        while (head.next != null) {
            A[t++] = head.next;
            head = head.next;
        }
        return A[t / 2];
    }

    //0-len ，取后面一位直接除就可以
    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{1, 2});
        System.out.println(node);
        System.out.println(链表的中间结点.middleNode(node).val);

    }
}
