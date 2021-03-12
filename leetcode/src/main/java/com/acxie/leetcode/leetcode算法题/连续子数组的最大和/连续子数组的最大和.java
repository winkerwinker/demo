package com.acxie.leetcode.leetcode算法题.连续子数组的最大和;

/**
 * @description:
 * @create: 2020/02/23 20:05
 */
public class 连续子数组的最大和 {


    public static int maxSubArray(int[] nums) {
        int now = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            now = nums[i] + now;
            max=Math.max(now,max);
            if (now<=0){
                now=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        System.out.println(maxSubArray(nums));

    }
}
