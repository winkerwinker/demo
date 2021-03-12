package com.acxie.leetcode.剑指offer.I二叉树的深度;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/10 13:44
 */

public class I二叉树的深度 {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

    public static void main(String[] args) {
        TreeNode t1 = TreeNodeUtil.convert(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        TreeNodeUtil.show(t1);
        int i = maxDepth(t1);
        System.out.println(i);


    }
}
