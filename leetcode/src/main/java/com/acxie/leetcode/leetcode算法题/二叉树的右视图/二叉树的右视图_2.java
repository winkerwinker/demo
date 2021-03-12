package com.acxie.leetcode.leetcode算法题.二叉树的右视图;




import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.*;

/**
 * @description:层次遍历，存入二维数组，然后取最大的
 * @create: 2020/02/06 18:41
 */
public class 二叉树的右视图_2 {


    public static List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> results = new ArrayList<Integer>();
        Stack<Integer> depthStack = new Stack<Integer>();
        stack.push(root);
        int max_depth = -1;
        depthStack.push(0);
/**
 * 应该与depth对应，放在map里面
 */
        while (!stack.isEmpty()) {
            int depth = depthStack.pop();


            max_depth = Math.max(max_depth, depth);
            TreeNode t = stack.pop();

            if (!map.containsKey(depth)) {
                map.put(depth, t.val);
            }

            if (t.left != null) {
                stack.push(t.left);
                depthStack.push(depth + 1);
            }
            if (t.right != null) {
                stack.push(t.right);
                depthStack.push(depth + 1);
            }
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            results.add(entry.getValue());
        }


        return results;
    }


    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{1, 2, 3, 4});
//        data_structure.TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{1, 2, 3, null, 5, null, 4});
//        data_structure.TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{1, 2, 3, 4, 5, null, 6, null, 7, null, null, null, null, 8, null});
        TreeNodeUtil.show(treeNode);
        System.out.println(rightSideView(treeNode));
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