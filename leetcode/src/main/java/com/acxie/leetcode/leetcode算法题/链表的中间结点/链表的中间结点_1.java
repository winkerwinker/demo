package com.acxie.leetcode.leetcode算法题.链表的中间结点;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * 快慢指针法
 * 当用慢指针 slow 遍历列表时，让另一个指针 fast 的速度是它的两倍。
 * 当 fast 到达列表的末尾时，slow 必然位于中间。
 */
public class 链表的中间结点_1 {


    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
        slow=slow.next;
        if (fast.next.next!=null) {
            fast = fast.next.next;
        }
        else {
            fast=fast.next;
        }
        }
        return  slow;
    }

    //0-len ，取后面一位直接除就可以
    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{1, 2});
        System.out.println(node);
        System.out.println(链表的中间结点_1.middleNode(node).val);

    }
}
