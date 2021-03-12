package com.acxie.leetcode.leetcode算法题.N叉树的后序遍历;



import java.util.*;


import com.acxie.leetcode.struct.n_treenode.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 应该使用队列来实现
 * @create: 2020/02/01 17:24
 */
public class N叉树的后序遍历_2 {


    public static List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.addFirst(node.val);
            for (Node item : node.children) {
                if (item != null) {
                    stack.add(item);
                }
            }
        }
        return output;
    }


    public static void main(String[] args) {
        Node list1 = new Node(1);
        Node list4 = new Node(3);
        List<Node> list2 = Arrays.asList(list4, new Node(2), new Node(4));
        List<Node> list3 = Arrays.asList(new Node(5), new Node(6));
        list4.children = list3;
        list1.children = list2;

        //进行后序列便利

        System.out.println(postorder(list1));
    }
}
