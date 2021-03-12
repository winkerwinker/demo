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
public class N叉树的后序遍历_1 {

//TODO 好好理解polllast addfirst
    static LinkedList<Integer> list = new LinkedList<>();

    public static List<Integer> postorder(Node root) {
        //注意这里
        LinkedList<Node> stack = new LinkedList<Node>();
        stack.add(root);


        while (!stack.isEmpty()) {
            Node top=stack.pollLast();
            list.addFirst(top.val);
            if (top.children!= null) {
                List<Node> childrens = top.children;
                for (int i = 0; i < childrens.size(); i++) {
                    //TODO 这里有问题
                    stack.add(childrens.get(i));
                    //push 是再最前面加
                   // stack.push(childrens.get(i));
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

        System.out.println(postorder(list1));
    }
}
