package com.acxie.leetcode.leetcode算法题.相同的树;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @create: 2020/02/01 23:39
 */
public class 相同的树 {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p==null&&q==null){
            return true;
        }
        if (p==null^q==null){
            return false;
        }


        if (p.val!=q.val) {
            return false;
        }
            return isSameTree( p.left,  q.left)&&isSameTree( p.right,  q.right);

    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        TreeNode treeNode1 = TreeNodeUtil.convert(new Integer[]{4, 2, 7, 1, 3, 6, 8});
        System.out.println(isSameTree(treeNode, treeNode1));

    }
}
