package com.acxie.leetcode.剑指offer.二叉树的最近公共祖先1;





// 没有重复数字
//一个节点也可以是它自己的祖先

import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/12 14:30
 */

public class 二叉树的最近公共祖先1 {


    //第一个夹在他们中间的
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 返回是否相同
        //pq 互换位子
        if (p.val > q.val) {
            TreeNode temp = p;
            p = q;
            q = temp;
        }

        if (root.val >= p.val && root.val <= q.val) {
            return root;
        }
        //这里的等于
        if (root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return null;
    }

    public static void main(String[] args) {
        //二叉搜索树
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        TreeNode treeNode1 = lowestCommonAncestor(treeNode, new TreeNode(0), new TreeNode(2));
        System.out.println(treeNode1.val);

    }

}