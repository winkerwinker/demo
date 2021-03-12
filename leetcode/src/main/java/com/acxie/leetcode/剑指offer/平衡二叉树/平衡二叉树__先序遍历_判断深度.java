package com.acxie.leetcode.剑指offer.平衡二叉树;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/12 18:44
 */


//如果逆向

public class 平衡二叉树__先序遍历_判断深度 {


    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int i = gethigh(root.left) - gethigh(root.right);
        return Math.abs(i) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }


    public static int gethigh(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(gethigh(root.left), gethigh(root.right));
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{1, 2, 2, 3, null, null, 3, 4, null, null, 4});
        TreeNodeUtil.show(treeNode);
        boolean balanced1 = isBalanced(treeNode);
        System.out.println(balanced1);
    }
}
