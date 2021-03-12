package com.acxie.leetcode.leetcode算法题.二叉树的右视图;




import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:层次遍历，存入二维数组，然后取最大的
 * @create: 2020/02/06 18:41
 */
public class 二叉树的右视图_3 {
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{1, 2, 3, 4});
//        data_structure.TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{1, 2, 3, null, 5, null, 4});
//        data_structure.TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{1, 2, 3, 4, 5, null, 6, null, 7, null, null, null, null, 8, null});
        TreeNodeUtil.show(treeNode);
        System.out.println(new 二叉树的右视图_3().rightSideView(treeNode));
    }

    public List<Integer> rightSideView(TreeNode root) {
        helper(root, 0);
        return list;
    }

    public void helper(TreeNode root, int n) {
        if (root == null) return;
        if (n == list.size()) list.add(root.val);
        helper(root.right, n + 1);
        helper(root.left, n + 1);
    }
}
/**
 * 错误用例
 * 1
 * /   \
 * 2       3
 * /
 * 4
 * [1, 3, 2]
 */