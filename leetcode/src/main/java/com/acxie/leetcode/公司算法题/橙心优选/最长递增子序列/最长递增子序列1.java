package com.acxie.leetcode.公司算法题.橙心优选.最长递增子序列;

import java.util.Arrays;

/**
 * @description:
 * @create: 2021/01/19 01:04
 * <p>
 * 正确答案，如果要枝剪
 */
public class 最长递增子序列1 {


    public static int lengthOfLIS(int[] nums) {

        if (nums.length < 2) {
            return nums.length;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            // 根据前面的结果进行dp
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[i]) {
                    // 将自己记录为当前最大的数字，用于给后面的数组对比
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int i = lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        System.out.println(i);
    }

}
