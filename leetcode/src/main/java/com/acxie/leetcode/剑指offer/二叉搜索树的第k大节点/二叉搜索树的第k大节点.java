package com.acxie.leetcode.剑指offer.二叉搜索树的第k大节点;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/12 13:01
 */

//转换成数组按照中序输出
public class 二叉搜索树的第k大节点 {

    static List<Integer> list;

    public static int kthLargest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        list = new ArrayList<Integer>();
        tolist(root);
        System.out.println(list);
        return list.get( k-1);

    }


    public static void tolist(TreeNode root) {

        if (root == null) return;
        tolist(root.right);
        list.add(root.val);
        tolist(root.left);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{3, 1, 4, null, 2});
        int i = kthLargest(treeNode, 1);
        System.out.println(i);
    }
}