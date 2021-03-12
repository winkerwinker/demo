package com.acxie.leetcode.公司算法题.橙心优选.连续子数组的最大和;

/**
 * @description:
 * @create: 2021/01/24 19:19
 */
public class 连续子数组的最大和 {


    public static int maxSubArray(int[] nums) {
        if (nums.length<1){
            return Integer.MIN_VALUE;
        }

        int max = nums[0];
        int[] dp = new int[nums.length + 1];
        // 面对每一个数字，我们都可以选 或者 不选
        for (int i = 0; i < nums.length; i++) {
            dp[i + 1] = Math.max(dp[i] + nums[i], nums[i]);
            max = Math.max(max, dp[i + 1]);
        }
        return max;

    }

    public static void main(String[] args) {
        int i = maxSubArray(new int[]{-2});
        System.out.println(i);
    }
}
