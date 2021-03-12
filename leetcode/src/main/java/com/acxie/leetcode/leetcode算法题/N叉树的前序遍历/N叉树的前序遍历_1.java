package com.acxie.leetcode.leetcode算法题.N叉树的前序遍历;



import com.acxie.leetcode.struct.n_treenode.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @description: 递归
 * @create: 2020/02/01 22:00
 */
public class N叉树的前序遍历_1 {


    static List<Integer> list = new ArrayList<>();

    public static List<Integer> preorder(Node root) {
        if (root == null) {
            return list;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node top = stack.pop();
            list.add(top.val);
            if (top.children != null) {
                List<Node> children = top.children;
//                for (data_structure.Node node : top.children) {
//                    stack.push(node);
//                }
                for (int i = children.size() - 1; i >= 0; i--) {
                    stack.push(children.get(i));
                }
            }

        }

        return list;

    }


    public static void main(String[] args) {
        Node list1 = new Node(1);
        Node list4 = new Node(3);
        List<Node> list2 = Arrays.asList(list4, new Node(2), new Node(4));
        List<Node> list3 = Arrays.asList(new Node(5), new Node(6));
        list4.children = list3;
        list1.children = list2;

        //进行后序列便利

        System.out.println(preorder(list1));
    }
}
