package com.acxie.leetcode.剑指offer.对称的二叉树;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @create: 2020/10/12 21:37
 */
public class 对称的二叉树 {


    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric1(root.left, root.right);
    }


    public static boolean isSymmetric1(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null ^ right == null) return false;
        return left.val == right.val && isSymmetric1(left.left, right.right) && isSymmetric1(left.right, right.left);
    }


//    3   4   4   3

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        TreeNodeUtil.show(treeNode);
        boolean balanced1 = isSymmetric(treeNode);
        System.out.println(balanced1);
    }
}
