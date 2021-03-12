package com.acxie.leetcode.leetcode算法题.合并二叉树;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

public class 合并二叉树 {

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        printfirst(t1);

        return null;
    }

    public static int[] printfirst(TreeNode t) {
        if (t != null) {
            printfirst(t.getLeft());
            System.out.println(t.getVal());
            printfirst(t.getRight());
        }
        return null;
    }


    public static void main(String[] args) {
        TreeNode t1 = TreeNodeUtil.convert(new Integer[]{1, 3, 2, 5});
        TreeNode t2 = TreeNodeUtil.convert(new Integer[]{2, 1, 3, null, 4, null, 7});
        TreeNodeUtil.show(t1);
        TreeNodeUtil.show(t2);
        合并二叉树.mergeTrees(t1, t2);
    }
}
