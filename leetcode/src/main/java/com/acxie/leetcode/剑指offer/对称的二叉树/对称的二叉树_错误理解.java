package com.acxie.leetcode.剑指offer.对称的二叉树;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @create: 2020/10/12 21:37
 */
public class 对称的二叉树_错误理解 {


    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null ^ root.right == null) return false;
        if (root.left.val != root.right.val) {
            return false;
        }
        return isSymmetric(root.left) && isSymmetric(root.right);
    }


//    3   4   4   3

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        TreeNodeUtil.show(treeNode);
        boolean balanced1 = isSymmetric(treeNode);
        System.out.println(balanced1);
    }
}
