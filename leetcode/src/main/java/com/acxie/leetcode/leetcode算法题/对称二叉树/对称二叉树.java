package com.acxie.leetcode.leetcode算法题.对称二叉树;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

public class 对称二叉树 {

    public static boolean isSymmetric1(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }

        return isSymmetric1(left.left, right.right) && isSymmetric1(left.right, right.left);

    }

    public static boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return isSymmetric1(root.left, root.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{3,4,4,5,null,null,5,6,null,null,6});
        TreeNodeUtil.show(treeNode);
        boolean result = isSymmetric(treeNode);
        System.out.println(result);
    }
}
