package com.acxie.leetcode.leetcode算法题.最大二叉树;


import com.acxie.leetcode.struct.treenode.TreeNodeUtil;


import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

public class 最大二叉树 {

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        int maxindex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxindex]) {
                maxindex = i;
            }
        }

        TreeNode treeNode = new TreeNode(nums[maxindex]);
        System.out.println(maxindex);

        if (maxindex > 0) {
            int[] nums1 = new int[maxindex];
            for (int i = 0; i < maxindex; i++) {
                nums1[i] = nums[i];
            }
            treeNode.left = constructMaximumBinaryTree(nums1);
        }
        if (nums.length - maxindex - 1 > 0) {
            int[] nums2 = new int[nums.length - maxindex - 1];
            int j = 0;
            for (int i = maxindex + 1; i < nums.length; i++) {
                nums2[j] = nums[i];
                j++;
            }
            treeNode.right = constructMaximumBinaryTree(nums2);
        }


        return treeNode;


    }

    public static void main(String[] args) {

        TreeNodeUtil.show(constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5}));
    }
}
