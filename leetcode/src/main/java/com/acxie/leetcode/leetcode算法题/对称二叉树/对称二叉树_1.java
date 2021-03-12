package com.acxie.leetcode.leetcode算法题.对称二叉树;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * 按层遍历：二维数字
 */
public class 对称二叉树_1 {

//队列

    public static boolean isSymmetric(TreeNode treeNode) {
            if (treeNode==null){
                return  true;
            }
        TreeNode[][] a = out(treeNode);
        for (int i = 0; i < a.length; i++) {
            if (!isSymmetricInline(a[i], (int) Math.pow(2, i))) {
                return false;
            }
        }
        return true;
    }


    public static boolean isSymmetricInline(TreeNode[] line, int size) {
        if (size == 1) return true;
        for (int i = 0; i < size / 2; i++) {
            if (line[i] == null && line[size - i - 1] == null) {
                continue;
            }
            if (line[i] == null ^ line[size - i - 1] == null) {
                return false;
            }
            if (line[i].val != line[size - i - 1].val) {
                return false;
            }
        }
        return  true;
    }


    public static TreeNode[][] out(TreeNode root) {
//如何得到最大的深度
        int deep = getTreeDepth(root);
        TreeNode[][] a = new TreeNode[deep][(int) Math.pow(2, getTreeDepth(root) - 1)];
        a[0][0] = root;
        for (int i = 0; i < deep - 1; i++) {
            int k = 0;
            for (int j = 0; j < (int) Math.pow(2, i); j++) {
                if (a[i][j] != null) {
                    a[i + 1][k++] = a[i][j].left;
                    a[i + 1][k++] = a[i][j].right;
                }
            }
        }

        return a;

        //
//        System.out.println("-------------------");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (a[i][j]==null) System.out.println("null");
//                else {
//                    System.out.println(a[i][j].val);
//                }
//            }
//        }

    }


    public static int getTreeDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getTreeDepth(root.left), getTreeDepth(root.right));
    }


    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{3,4,4,5,null,null,5,6,null,null,6});
        TreeNodeUtil.show(treeNode);
        System.out.println(isSymmetric(treeNode));

    }
}
