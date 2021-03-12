package com.acxie.leetcode.leetcode算法题.二叉树的公共祖先;


import com.acxie.leetcode.struct.treenode.TreeNode;

public class 二叉树的最近公共祖先 {
    private TreeNode ans;

    public 二叉树的最近公共祖先() {
        // Variable to store LCA node.
        this.ans = null;
    }

    private boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {

        // If reached the end of a branch, return false.
        if (currentNode == null) {
            return false;
        }

        // Left Recursion. If left recursion returns true, set left = 1 else 0
        int left = this.recurseTree(currentNode.left, p, q) ? 1 : 0;

        // Right Recursion
        int right = this.recurseTree(currentNode.right, p, q) ? 1 : 0;

        // If the current node is one of p or q
        int mid = (currentNode == p || currentNode == q) ? 1 : 0;


        // If any Two of the flags left, right or mid become True
        if (mid + left + right >= 2) {
            this.ans = currentNode;
        }

        // Return true if any one of the three bool values is True.
        return (mid + left + right > 0);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Traverse the tree
        this.recurseTree(root, p, q);
        return this.ans;
    }


//    public static void main(String[] args) {
//        data_structure.TreeNode t1 = TreeNodeUtil.convert(new Integer[]{3,5,1,6,2,0,8,null,null,7,4});
//        TreeNodeUtil.show(t1);
//        System.out.println(new 二叉树的最近公共祖先().lowestCommonAncestor(t1, new data_structure.TreeNode(5), new data_structure.TreeNode(1)).val
//        );
//    }
}
