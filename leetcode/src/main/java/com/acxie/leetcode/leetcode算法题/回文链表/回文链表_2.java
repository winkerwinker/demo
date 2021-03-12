package com.acxie.leetcode.leetcode算法题.回文链表;



import com.acxie.leetcode.struct.listnode.ListNode;

import java.util.Stack;

/**
 * @description: 快慢指针、使用栈
 * @author: xieaichen
 * @date: 2020-01-28
 */
public class
回文链表_2 {


    public static boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode slow = head;
        ListNode fast = head;
        //前一个或者正中间
        stack.add(head);
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            stack.add(slow);
        }

        if (fast.next == null) {
            stack.pop();
        }

        slow = slow.next;
        while (slow != null) {
            if (slow.val != stack.peek().val) {
                return false;
            }
            stack.pop();
            slow = slow.next;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(new ListNode(new int[]{})));
        //   System.out.println(isPalindrome(new data_structure.ListNode(new int[]{1,2,3,2,1})));

    }
}


