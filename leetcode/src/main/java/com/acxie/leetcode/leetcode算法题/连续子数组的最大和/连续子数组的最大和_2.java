package com.acxie.leetcode.leetcode算法题.连续子数组的最大和;

/**
 * @description:
 * @create: 2020/02/23 20:05
 */
public class 连续子数组的最大和_2 {


    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int temp_max = 0;
        for (int num : nums) {
            temp_max += num;
            max = temp_max > max ? temp_max : max;
            if (temp_max <= 0) {
                temp_max = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        System.out.println(maxSubArray(nums));

    }
}
