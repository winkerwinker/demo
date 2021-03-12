package com.acxie.leetcode.公司算法题.橙心优选.二叉树最近公共祖先;



import com.acxie.leetcode.leetcode算法题.二叉树的公共祖先.二叉树的最近公共祖先_1;
import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

public class 二叉树最近公共祖先2 {


    /**
     * 非二叉搜索树
     * todo 错误
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    //第一个夹在他们中间的
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);
        if (left && right || (root.val == q.val || root.val == p.val)) return root;
        if (left ^ right) return left ? lowestCommonAncestor(root.left, p, q) : lowestCommonAncestor(root.right, p, q);
        return null;
    }

    // 判断是否有两个节点中的任意一个
    public static boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        if (root.val == p.val || root.val == q.val) {
            return true;
        }
        return dfs(root.left, p, q) || dfs(root.right, p, q);

    }


    public static void main(String[] args) {
        TreeNode t1 = TreeNodeUtil.convert(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNodeUtil.show(t1);
        System.out.println(new 二叉树的最近公共祖先_1().lowestCommonAncestor(t1, new TreeNode(5), new TreeNode(4)).val
        );
    }
}
