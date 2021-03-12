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

public class 二叉树的最近公共祖先2 {

    static TreeNode res;


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        res = root;
        dfs(root, p, q);
        return res;
    }

    public static boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        //是否两个都找到了
        boolean a = root.val == p.val || root.val == q.val;
        if (a) return true;
        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);
        if (left && right) {
            res = root;
        } else if (left && !right) {
            res = root.left;
            dfs(root.left, p, q);
        } else if (!left && right) {
            res = root.right;
            dfs(root.right, p, q);
        }
        //在这个节点下是否找到了一个节点
        return left || right;
    }


    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode treeNode1 = lowestCommonAncestor(treeNode, new TreeNode(8), new TreeNode(5));
        System.out.println(treeNode1.val);

    }
}
