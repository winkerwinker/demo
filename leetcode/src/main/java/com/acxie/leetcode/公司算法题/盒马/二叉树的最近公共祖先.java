package com.acxie.leetcode.公司算法题.盒马;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description: todo hemA
 * @create: 2020/12/01 02:15
 */
public class 二叉树的最近公共祖先 {


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        //  if (root.val == p.val || root.val == q.val) return root;

        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);
        // 两边都找到了

        if ((left && right) || (root.val == p.val || root.val == q.val)) {
            return root;
        } else {
            return lowestCommonAncestor(left ? root.left: root.right, p, q);
        }


    }

    //搜索一个
    public static boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        if (root.val == p.val || root.val == q.val) {
            return true;
        } else if (root.left == null && root.right == null) {
            return false;
        }
        return dfs(root.left, p, q) || dfs(root.right, p, q);
    }

    public static void main(String[] args) {
        TreeNode convert = TreeNodeUtil.convert(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNodeUtil.show(convert);

        TreeNode treeNode = lowestCommonAncestor(convert, new TreeNode(8), new TreeNode(1));
        System.out.println(treeNode.val);
        TreeNodeUtil.show(treeNode);

    }
}
