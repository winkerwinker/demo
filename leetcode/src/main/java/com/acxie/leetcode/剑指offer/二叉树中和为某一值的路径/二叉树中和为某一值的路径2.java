package com.acxie.leetcode.剑指offer.二叉树中和为某一值的路径;




import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.List;

/**
 * @description: 枚举所有
 * @create: 2020/10/12 23:13
 */
public class 二叉树中和为某一值的路径2 {


    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        pathSum1(root, sum);
        return null;
    }

    //    从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
    public static boolean pathSum1(TreeNode root, int sum) {
        if (root.left == null && root.right == null && sum == root.val) {
            System.out.println("找到一个啦！");
            return true;
        }
        if (root.left != null) {
            return pathSum1(root.left, sum - root.val);
        }
        if (root.right != null) {
            return pathSum1(root.right, sum - root.val);
        }
        return false;
    }


    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1});
        TreeNodeUtil.show(treeNode);
        List<List<Integer>> lists = pathSum(treeNode, 22);
    }
}

