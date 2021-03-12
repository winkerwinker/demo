package com.acxie.leetcode.leetcode算法题.二叉搜索树的最近公共祖先;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

//二叉搜索树左节点小于右节点
public class 二叉搜索树的最近公共祖先_1 {

    static TreeNode a;

    public static TreeNode printlast(TreeNode root, TreeNode p, TreeNode q) {
        if (root != null) {
            if (root.val == p.val || root.val == q.val) {
                a = root;
            } else if (root.val > p.val ^ root.val > q.val) {
                a = root;
            } else if (root.val > p.val) {
                printlast(root.left, p, q);
            } else if (root.val > p.val) {
                printlast(root.right, p, q);
            }
        }
        return a;
    }


    public static void main(String[] args) {
        TreeNode t1 = TreeNodeUtil.convert(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        TreeNodeUtil.show(t1);
//        System.out.println(二叉搜索树的最近公共祖先_1.lowestCommonAncestor(t1, new data_structure.TreeNode(2), new data_structure.TreeNode(4)).val
//        );
        System.out.println(printlast(t1, new TreeNode(3), new TreeNode(5)).val);

        System.out.println(printlast(t1, new TreeNode(2), new TreeNode(4)).val);


    }
}
