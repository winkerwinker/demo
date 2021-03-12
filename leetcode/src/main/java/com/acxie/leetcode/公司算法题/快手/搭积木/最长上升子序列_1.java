package com.acxie.leetcode.公司算法题.快手.搭积木;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @create: 2020/02/24 22:47
 */
public class 最长上升子序列_1 {


    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{7, 9, 8, 3, 4, 5, 6, 7}));
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length < 2) return nums.length;
        int max = 1;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int temp = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] >= nums[j]) {
                    temp = Math.max(temp, dp[j] + 1);
                }
            }
            dp[i] = temp;
            max = Math.max(temp, max);
        }
//        System.out.println(Arrays.toString(dp));
        return max;
    }
}
