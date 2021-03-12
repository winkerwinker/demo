package com.acxie.leetcode.struct.treenode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 使用栈实现dfs
 */
public class 二叉树深度优先算法 {


    //深度优先遍历
    public static void depthFirstSearch(TreeNode head) {
        if (head==null){
            System.out.println("binary tree is empty!!!");
            return;
        }
        Stack<TreeNode> stack=new Stack();
        stack.push(head);
        while (!stack.isEmpty()){
            TreeNode tn=stack.pop();
            System.out.println(tn.val);
            if (tn.right!=null) {
                stack.push(tn.right);
            }
            if (tn.left!=null) {
                stack.push(tn.left);
            }
        }
        System.out.println(stack);
    }

    //广度优先遍历
    public static void BroadFirstSearch(TreeNode head) {
        if (head==null){
            System.out.println("binary tree is empty!!!");
            return;
        }
        //链表
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()){
            TreeNode t=queue.poll();
            System.out.print(t.val+"  ");
            if (t.left!=null){
                queue.add(t.left);
            }
            if (t.right!=null){
                queue.add(t.right);
            }
        }

    }


        public static void main(String[] args) {
        TreeNode t1 = TreeNodeUtil.convert(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        TreeNodeUtil.show(t1);
        二叉树深度优先算法.BroadFirstSearch(t1);
    }

}
