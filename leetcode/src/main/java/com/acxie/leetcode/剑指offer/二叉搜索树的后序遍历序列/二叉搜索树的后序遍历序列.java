package com.acxie.leetcode.剑指offer.二叉搜索树的后序遍历序列;

/**
 * @description:
 * @create: 2020/10/12 22:25
 */
public class 二叉搜索树的后序遍历序列 {


    static int[] ints;

    public static boolean verifyPostorder(int[] postorder) {
        //左右子数划分
        ints = postorder;
        return verifyPostorder1(0, postorder.length - 1);
    }

    public static boolean verifyPostorder1(int left, int right) {
        if (left >= right) {
            return true;
        }
        int index = right;
        for (int i = left; i < right; i++) {
            if (ints[i] > ints[right]) {
                index = i;
                break;
            }
        }
        //每个都必须比他大
        for (int i = index + 1; i < right; i++) {
            if (ints[i] <= ints[right]) {
                return false;
            }
        }
        //左右子数划分
        return verifyPostorder1(left, index - 1) && verifyPostorder1(index, right - 1);
    }

    public static void main(String[] args) {
        boolean balanced1 = verifyPostorder(new int[]{7, 4, 6, 5});
        System.out.println(balanced1);

    }

}
