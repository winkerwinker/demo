package com.acxie.leetcode.struct.node;

import java.util.ArrayList;

/**
 * @description: 双向链表
 * @create: 2020/02/01 20:00
 */
public class Node {

    public int val;
    public Node next;
    public Node pre;


    public Node(int x) {
        val = x;
        next = this;
        pre = this;
    }

    public Node(int[] x) {
        val = x[0];
        Node other = new Node(x[0]);
        //获得next

        //todo

        for (int i = 1; i < x.length; i++) {
            other.next = new Node(x[i + 1]);
            other.pre = new Node(x[i - 1]);
        }

    }


    @Override
    public String toString() {
        ArrayList<Integer> objects = new ArrayList<>();
        Node node = this;

        while (node != null) {
            objects.add(this.val);
            node = node.next;
        }

        return objects.toString();
    }


    // 环形链表
}
