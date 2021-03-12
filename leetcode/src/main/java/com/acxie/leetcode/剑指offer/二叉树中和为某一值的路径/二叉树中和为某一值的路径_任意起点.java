package com.acxie.leetcode.剑指offer.二叉树中和为某一值的路径;




import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description: 获取所有路径
 * @create: 2020/10/12 23:13
 */
public class 二叉树中和为某一值的路径_任意起点 {


    static List<List<Integer>> lists;
    static Stack<Integer> stack;


    public static List<List<Integer>> solution(TreeNode root, int sum) {
        lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        pathSum(root, sum);
        while (!(root.left == null && root.right == null)) {
            pathSum(root.left, sum);
            pathSum(root.right, sum);
        }
        return lists;
    }


    public static void pathSum(TreeNode root, int sum) {
        if (root == null) {
            return ;
        }
        pathSum1(root, sum);
    }

    //    从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
    public static void pathSum1(TreeNode root, int sum) {
        stack.push(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            System.out.println("find  :  " + stack);
            lists.add(new ArrayList<Integer>(stack));
        }
        if (root.left != null) {
            pathSum1(root.left, sum - root.val);
            stack.pop();
        }
        if (root.right != null) {
            pathSum1(root.right, sum - root.val);
            stack.pop();
        }
    }


    public static void main(String[] args) {

        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1});
        TreeNodeUtil.show(treeNode);
        List<List<Integer>> lists = solution(treeNode, 22);

    }
}
