package com.acxie.leetcode.剑指offer.二叉树的镜像;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/10 13:57
 */

public class 二叉树的镜像 {


    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        //交换
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        TreeNodeUtil.show(root);

        mirrorTree(root.left);

        mirrorTree(root.right);

        return root;

    }

    public static void main(String[] args) {
        TreeNode t1 = TreeNodeUtil.convert(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        TreeNodeUtil.show(t1);
        TreeNode treeNode = mirrorTree(t1);
        TreeNodeUtil.show(treeNode);
    }
}
