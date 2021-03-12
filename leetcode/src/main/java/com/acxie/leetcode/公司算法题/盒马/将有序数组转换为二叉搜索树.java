package com.acxie.leetcode.公司算法题.盒马;




import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.Arrays;

import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

/**
 * @description:
 * @create: 2020/12/01 02:52
 */
public class 将有序数组转换为二叉搜索树 {


    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int center = nums.length / 2;
        TreeNode treeNode = new TreeNode(nums[center]);
        treeNode.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, center));
        treeNode.right = sortedArrayToBST(Arrays.copyOfRange(nums, center + 1, nums.length));


        return treeNode;

    }


    public static void main(String[] args) {

        int[] ints = {-10, -3, 0, 5, 9};
        TreeNode treeNode = sortedArrayToBST(ints);
        TreeNodeUtil.show(treeNode);
    }
}
