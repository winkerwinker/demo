package com.acxie.leetcode.剑指offer.从上到下打印二叉树1;




import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.*;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/12 16:49
 */

public class 从上到下打印二叉树1_栈 {


    //先进先出 队列
    static Queue<TreeNode> nodes;
    static List<TreeNode> list;

    //使用栈
    public static int[] levelOrder(TreeNode root) {
        nodes = new LinkedList<>();
        list = new ArrayList<>();
        //获得层数、循环层数
        int high = gethigh(root);
        System.out.println(high);
        nodes.add(root);
        for (int i = 0; i < high; i++) {
            levelOrder1();
        }
        return list.stream().map(a -> a.val).mapToInt(Integer::valueOf).toArray();

    }


    public static int gethigh(TreeNode root) {
        if (root==null) return 0;
        return 1 + Math.max(gethigh(root.left), gethigh(root.right));
    }

    //使用栈
    public static void levelOrder1() {
        Queue<TreeNode> temp = new LinkedList<>();
        while (!nodes.isEmpty()) {
            TreeNode pop = nodes.poll();
            list.add(pop);
            if (pop.left != null) {
                temp.add(pop.left);
            }
            if (pop.right != null) {
                temp.add(pop.right);
            }
        }
        nodes = temp;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{3, 9, 20, 15, 7});
        int[] ints = levelOrder(treeNode);
        System.out.println(Arrays.toString(ints));

    }
}
