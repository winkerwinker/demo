package com.acxie.leetcode.剑指offer.从上到下打印二叉树1;




import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.*;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/12 16:49
 */

public class 从上到下打印二叉树1_栈_优化 {


    public static int[] levelOrder(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        List<TreeNode> list = new ArrayList<>();
        //获得层数、循环层数
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode pop = nodes.poll();
            list.add(pop);
            if (pop.left != null) {
                nodes.add(pop.left);
            }
            if (pop.right != null) {
                nodes.add(pop.right);
            }
        }
        return list.stream().map(a -> a.val).mapToInt(Integer::valueOf).toArray();
    }


    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{3, 9, 20, 15, 7});
        int[] ints = levelOrder(treeNode);
        System.out.println(Arrays.toString(ints));

    }
}
