package com.acxie.leetcode.公司算法题.盒马.前段;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;
/**
 * @description: fn([0, 1, 2, ' 1 ', ' 1 ', 3, ' 3 ' ]) =>[0, 1, 2, '1',, 3, '3']
 * @create: 2020/12/01 23:35
 */
public class 查找高度 {
    //hashset
    public static int slove(TreeNode node) {
        if (node == null) {
            return 0;

        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return 1
                + Math.max(slove(node.left), slove(node.right));

    }


    public static void main(String[] args) {

        TreeNode t1 = TreeNodeUtil.convert(new Integer[]{6});

        TreeNodeUtil.show(t1);
        int slove = slove(t1);
        System.out.println(slove);

    }

}


//class Node {
//    Node left;
//    Node right;
//    int val;
//
//    public Node(int val) {
//        this.val = val;
//    }
//
//    public Node getLeft() {
//        return left;
//    }
//
//    public void setLeft(Node left) {
//        this.left = left;
//    }
//
//    public Node getRight() {
//        return right;
//    }
//
//    public void setRight(Node right) {
//        this.right = right;
//    }
//
//    public int getVal() {
//        return val;
//    }
//
//    public void setVal(int val) {
//        this.val = val;
//    }
//}
