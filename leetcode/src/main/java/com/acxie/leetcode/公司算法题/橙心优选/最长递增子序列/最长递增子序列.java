package com.acxie.leetcode.公司算法题.橙心优选.最长递增子序列;

/**
 * @description:
 * @create: 2021/01/19 01:04
 *
 * todo 需要用数组存储 index + min 剪枝
 */
public class 最长递增子序列 {


    public static int lengthOfLIS(int[] nums, int min, int index) {
        if (index == nums.length) {
            return 0;
        }

        if (nums[index] > min) {
            int temp = lengthOfLIS(nums, nums[index], index + 1) + 1;
            return Math.max(temp, lengthOfLIS(nums, min, index + 1));
        } else {
            return lengthOfLIS(nums, min, index + 1);

        }
    }

    public static int lengthOfLIS(int[] nums) {
        return lengthOfLIS(nums, Integer.MIN_VALUE, 0);
    }


    public static void main(String[] args) {
        //int i = lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        //int i = lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        int i = lengthOfLIS(new int[]{0});
        System.out.println(i);
    }

}
