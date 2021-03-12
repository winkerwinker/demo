package com.acxie.leetcode.struct.treenode;

/**
 * @Author : xieaichen
 * @Date : 2020/10/12 18:31
 * @Discription： 二叉树
 */
public class TreeNode {
    //control + return
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }


    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
