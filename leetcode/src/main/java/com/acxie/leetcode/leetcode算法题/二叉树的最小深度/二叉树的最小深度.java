package com.acxie.leetcode.leetcode算法题.二叉树的最小深度;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @create: 2020/02/06 18:01
 */
public class 二叉树的最小深度 {

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
//注意
        if (root.left == null && root.right != null) {
            return minDepth(root.right) + 1;
        }
        if (root.left != null && root.right == null) {
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;

    }


    public static int minDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
//注意
        if (root.left != null && root.right != null) {
            return 1;
        } else {
            return Math.min(minDepth1(root.left), minDepth1(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
//        data_structure.TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{3, 9, 20, null, null, 15, 7});
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{1, 2,null,4,null});
        System.out.println(minDepth(treeNode));
    }
}
