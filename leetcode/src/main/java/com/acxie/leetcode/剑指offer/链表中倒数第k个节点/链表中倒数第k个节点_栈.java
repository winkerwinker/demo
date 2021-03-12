package com.acxie.leetcode.剑指offer.链表中倒数第k个节点;



import com.acxie.leetcode.struct.listnode.ListNode;

import java.util.Stack;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/10 10:59
 */

//双指针求解
public class 链表中倒数第k个节点_栈 {

    public static ListNode getKthFromEnd(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while (--k > 0) {
            stack.pop();
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        ListNode a = getKthFromEnd(new ListNode(new int[]{1}), 1);
        System.out.println(a.val);
    }
}
