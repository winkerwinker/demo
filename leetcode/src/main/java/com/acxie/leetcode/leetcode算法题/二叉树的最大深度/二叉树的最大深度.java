package com.acxie.leetcode.leetcode算法题.二叉树的最大深度;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @create: 2020/02/01 23:49
 */
public class 二叉树的最大深度 {


    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }


    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        System.out.println(maxDepth(treeNode));

    }
}
