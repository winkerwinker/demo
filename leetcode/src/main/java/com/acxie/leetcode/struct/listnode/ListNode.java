package com.acxie.leetcode.struct.listnode;

/**
 * @Author : xieaichen
 * @Date : 2020/10/12 18:31 
 * @Discription ： 链表
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode(int[] x) {
        val = x[0];
        ListNode other=this;
        for (int i = 1; i < x.length; i++) {
            ListNode temp = new ListNode(x[i]);
            other.next = temp;
            other=temp;
        }
    }


    /**
     *深入理解一下这里other的用法
     * ！！！！！！
     */


    @Override
    public String toString() {
        ListNode listNode = this;
        StringBuilder sb = new StringBuilder();
        if (listNode == null) {
            return "链表为空";
        }
        ListNode other=listNode;
        while (other != null) {
//            System.out.print(other.val +"  ");
            sb.append(other.val);
            sb.append("  ");
            other = other.next;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        ListNode node=new ListNode(new int []{1,2,3});
        System.out.println(node);
    }
}
