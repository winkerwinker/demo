package com.acxie.leetcode.剑指offer.二叉搜索树的第k大节点;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/12 13:01
 */

//转换成数组按照中序输出
public class 二叉搜索树的第k大节点_官方题解 {

    int res, k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;

    }


    public void dfs(TreeNode root) {

        if (root == null) {
            return;
        }
        dfs(root.right);
        k--;
        if (k == 0) {
            res = root.val;
        }
        dfs(root.left);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{3, 1, 4, null, 2});
        int i = new 二叉搜索树的第k大节点_官方题解().kthLargest(treeNode, 1);
        System.out.println(i);
    }
}