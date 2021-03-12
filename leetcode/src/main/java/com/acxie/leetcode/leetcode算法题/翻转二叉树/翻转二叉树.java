package com.acxie.leetcode.leetcode算法题.翻转二叉树;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @create: 2020/02/01 23:31
 */
public class 翻转二叉树 {



    public static TreeNode invertTree(TreeNode root) {

        if (root==null||(root.left==null&& root.right==null)){
            return root;
        }
        TreeNode temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);

        return root;

    }


    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        TreeNodeUtil.show(invertTree(treeNode));

    }
}
