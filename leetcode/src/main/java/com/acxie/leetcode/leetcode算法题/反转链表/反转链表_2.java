package com.acxie.leetcode.leetcode算法题.反转链表;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * @description:双指针迭代
 * @create: 2020/02/01 22:25
 */
public class 反转链表_2 {
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？


    public static ListNode reverseList(ListNode head) {
        //TODO 这两句的区别？
        //pre不能指向head 不然是个圈!
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }

        head=pre;
        return head;
    }

    public static void main(String[] args) {
        ListNode a = reverseList(new ListNode(new int[]{1, 2, 3, 4}));
        System.out.println(a);//Java heap space
    }
}
