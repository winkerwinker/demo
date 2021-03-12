package com.acxie.leetcode.剑指offer.二叉树的最近公共祖先2;





// 没有重复数字
//一个节点也可以是它自己的祖先

import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/12 14:30
 */

public class 二叉树的最近公共祖先_官方题解 {


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);
        if (left && right) return root;
        if (left ^ right) return left ? lowestCommonAncestor(root.left, p, q) : lowestCommonAncestor(root.right, p, q);
        return null;
    }

    //并不是返回是不是，而是返回这个root对不对
    public static boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null){ return  false;}
        if (root.val==q.val||root.val==p.val) return true;
        return   dfs( root.left,  p,  q)|| dfs( root.right,  p,  q);
    }


    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode treeNode1 = lowestCommonAncestor(treeNode, new TreeNode(8), new TreeNode(5));
        System.out.println(treeNode1.val);

    }
}
