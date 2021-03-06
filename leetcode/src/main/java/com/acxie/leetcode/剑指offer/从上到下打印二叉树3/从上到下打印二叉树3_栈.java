package com.acxie.leetcode.剑指offer.从上到下打印二叉树3;




import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.*;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/12 16:49
 */

public class 从上到下打印二叉树3_栈 {

    //先进先出 队列
    static Stack<TreeNode> nodes;
    static List<List<Integer>> list;

    //使用栈
    public static List<List<Integer>> levelOrder(TreeNode root) {
        nodes = new Stack<TreeNode>();
        list = new ArrayList<List<Integer>>();
        //获得层数、循环层数
        nodes.add(root);
        int high = gethigh(root);
        for (int i = 0; i < high; i++) {
            levelOrder1();
        }
        return list;

    }


    public static int gethigh(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(gethigh(root.left), gethigh(root.right));
    }

    //使用栈
    public static void levelOrder1() {
        Stack<TreeNode> temp = new Stack<>();
        ArrayList<Integer> templist = new ArrayList<>();
        while (!nodes.isEmpty()) {
            TreeNode pop = nodes.pop();
            templist.add(pop.val);
            if (pop.left != null) {
                temp.add(pop.left);
            }
            if (pop.right != null) {
                temp.add(pop.right);
            }
        }
        nodes = temp;
        list.add(templist);
    }


    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{3,9,20,null,null,15,7});
        List<List<Integer>> lists = levelOrder(treeNode);
        System.out.println(lists);

    }
}
