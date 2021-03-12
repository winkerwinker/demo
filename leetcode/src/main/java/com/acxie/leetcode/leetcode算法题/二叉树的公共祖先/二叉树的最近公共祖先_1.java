package com.acxie.leetcode.leetcode算法题.二叉树的公共祖先;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

public class 二叉树的最近公共祖先_1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null){
            return null;
        }
        boolean m=false,left=false,right=false;
        left= dfs( root.left,  p,  q);
        right=dfs( root.right,  p,  q);
        if (left&&right||(root.val==q.val||root.val==p.val)) return root;
        if (left^right) return left?lowestCommonAncestor(root.left,p,q) :lowestCommonAncestor(root.right,p,q);
        return null;
    }

    //递归的时候可以把flag作为参数传递。。。。。。。

    public boolean  dfs(TreeNode root, TreeNode p, TreeNode q) {
            if (root==null){ return  false;}
            if (root.val==q.val||root.val==p.val) return true;
            return   dfs( root.left,  p,  q)|| dfs( root.right,  p,  q);
    }


    public static void main(String[] args) {
        TreeNode t1 = TreeNodeUtil.convert(new Integer[]{3,5,1,6,2,0,8,null,null,7,4});
        TreeNodeUtil.show(t1);
        System.out.println(new 二叉树的最近公共祖先_1().lowestCommonAncestor(t1, new TreeNode(5), new TreeNode(4)));
    }
}

