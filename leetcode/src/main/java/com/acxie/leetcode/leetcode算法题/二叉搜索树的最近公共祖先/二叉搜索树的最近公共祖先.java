package com.acxie.leetcode.leetcode算法题.二叉搜索树的最近公共祖先;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

//二叉搜索树左节点小于右节点
public class 二叉搜索树的最近公共祖先 {

    /**
     * 如何判断A节点是否是B节点的父子节点？
     */
    static TreeNode answer = null;
    static int flag = 2;

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        answer = null;
        flag = 2;
        printlast(root, p, q);
        return answer;
    }

    public static TreeNode printlast(TreeNode root, TreeNode p, TreeNode q) {

        if (flag != 10 && root != null) {
            printlast(root.left, p, q);
            printlast(root.right, p, q);
            if (flag == 0) {
                System.out.println("!!!!  Answer:" + root.val);
                answer = root;
                flag = 10;
                return root;
            }

            System.out.println(root.val);
            if (root.val == p.val) {
                flag--;
                if (flag == 0) {
                }
            }
            if (root.val == q.val) {
                flag--;
            }

        }
        return null;
    }


    public static TreeNode isIn(TreeNode root, TreeNode p, TreeNode q) {
        if (flag != 10 && root != null) {
            printlast(root.left, p, q);
            printlast(root.right, p, q);
            if (flag == 0) {
                System.out.println("!!!!  Answer:" + root.val);
                answer = root;
                flag = 10;
                return root;
            }

            System.out.println(root.val);
            if (root.val == p.val) {
                flag--;
                if (flag == 0) {
                }
            }
            if (root.val == q.val) {
                flag--;
            }

        }
        return null;

    }

    public static void main(String[] args) {
        TreeNode t1 = TreeNodeUtil.convert(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        TreeNodeUtil.show(t1);
        System.out.println(二叉搜索树的最近公共祖先.lowestCommonAncestor(t1, new TreeNode(2), new TreeNode(4)).val
        );
    }
}
