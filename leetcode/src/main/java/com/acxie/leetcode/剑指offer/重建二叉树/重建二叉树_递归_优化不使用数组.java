package com.acxie.leetcode.剑指offer.重建二叉树;




import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.HashMap;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/12 10:47
 */


//前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7]
//返回二叉树
//buildTree1(Arrays.stream(preorder).boxed().collect(Collectors.toList()), Arrays.stream(preorder).boxed().collect(Collectors.toList()), treeNode);
public class
重建二叉树_递归_优化不使用数组 {

    static int[] preorder_;
    static HashMap<Integer, Integer> inorder_ = new HashMap<Integer, Integer>();

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        preorder_ = preorder;
        for (int i = 0; i < inorder.length; i++) {
            inorder_.put(inorder[i], i);
        }
        return buildTree1(0, 0, inorder.length - 1);
    }


    public static TreeNode buildTree1(int root, int in_left, int in_right) {
        if (in_left > in_right || root >= preorder_.length || root < 0)
            return null;
        TreeNode treeNode = new TreeNode(preorder_[root]);
        //使用map 方便通过value 找到key
        int i = inorder_.get(preorder_[root]);
        treeNode.left = buildTree1(root + 1, in_left, i - 1);
        treeNode.right = buildTree1(root + i - in_left + 1, i + 1, in_right);
        return treeNode;
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode treeNode = buildTree(preorder, inorder);
        TreeNodeUtil.show(treeNode);
    }
}
