package com.acxie.leetcode.剑指offer.重建二叉树;




import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/12 10:47
 */


//前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7]
//返回二叉树
//buildTree1(Arrays.stream(preorder).boxed().collect(Collectors.toList()), Arrays.stream(preorder).boxed().collect(Collectors.toList()), treeNode);
public class 重建二叉树_递归 {


    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree1(preorder, inorder, null);
    }


    public static TreeNode buildTree1(int[] preorder, int[] inorder, TreeNode treeNode) {
        if (preorder.length == 0) {
            return null;
        }
        treeNode = new TreeNode(preorder[0]);
        for (int j = 0; j < inorder.length; j++) {
            if (preorder[0] == inorder[j]) {
                int[] leftIn = Arrays.copyOfRange(inorder, 0, j);
                int[] rightIn = Arrays.copyOfRange(inorder, j + 1, preorder.length);
                int[] leftPre = Arrays.copyOfRange(preorder, 1, 1 + leftIn.length);
                int[] rightPre = Arrays.copyOfRange(preorder, 1 + leftIn.length, preorder.length);
                //直接返回首字母
                treeNode.left = buildTree1(leftPre, leftIn, treeNode);
                treeNode.right = buildTree1(rightPre, rightIn, treeNode);
            }
        }
        return treeNode;
    }

    public static void main(String[] args) {
        int[] preorder = {3};
        int[] inorder = {3};
        TreeNode treeNode = buildTree(preorder, inorder);
        TreeNodeUtil.show(treeNode);
    }
}
