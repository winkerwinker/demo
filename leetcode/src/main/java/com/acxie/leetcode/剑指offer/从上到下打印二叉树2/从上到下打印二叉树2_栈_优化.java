package com.acxie.leetcode.剑指offer.从上到下打印二叉树2;




import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/12 16:49
 */

public class 从上到下打印二叉树2_栈_优化 {


    public static List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> nodes = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            ArrayList<Integer> objects = new ArrayList<>();
            res.add(objects);
            return res;
        }
        //获得层数、循环层数
        nodes.add(root);
        while (!nodes.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            //初始了就不会改变
            for (int i = nodes.size(); i > 0; i--) {
                TreeNode pop = nodes.poll();
                tmp.add(pop.val);
                if (pop.left != null) {
                    nodes.add(pop.left);
                }
                if (pop.right != null) {
                    nodes.add(pop.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }


    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{});
        List<List<Integer>> lists = levelOrder(treeNode);
        System.out.println(lists);

    }
}
