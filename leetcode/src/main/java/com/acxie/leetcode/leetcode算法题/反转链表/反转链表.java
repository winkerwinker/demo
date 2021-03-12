package com.acxie.leetcode.leetcode算法题.反转链表;



import com.acxie.leetcode.struct.listnode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:存入数组
 * @create: 2020/02/01 22:25
 */
public class 反转链表 {
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？


    public static ListNode reverseList(ListNode head) {
        if(head==null){return null;}
        List<Integer> list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

//        System.out.println(list);
        ListNode outhead = new ListNode(list.get(list.size()-1));
        ListNode other = outhead;


        for (int i = list.size()-2; i >=0 ; i--) {
            other.next = new ListNode(list.get(i));
            other = other.next;

        }
        return outhead;
    }

    public static void main(String[] args) {
        ListNode a = reverseList(new ListNode(new int[]{1, 2, 3, 4}));
        System.out.println(a);
    }
}
