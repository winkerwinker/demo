package com.acxie.leetcode.leetcode算法题.目标和;

import java.util.Arrays;

/**
 * @description:动态规划
 * @create: 2020/02/03 16:08
 */
public class 目标和_1 {
    //如果只是单纯的求解和为某个S的组合个数，那就是01背包。。。
//该问题可以转换为 Subset Sum 问题，从而使用 0-1 背包的方法来求解。
//正数集的和的两倍 == 等于目标和 + 序列总和
//问题变成了找到一个正数集= a
    static int count;

    public static int findTargetSumWays(int[] nums, int S) {
        int[] dp = new int[2001];
        dp[nums[0] + 1000] = 1;
        dp[-nums[0] + 1000] += 1;
        for (int i = 1; i < nums.length; i++) {
            int[] next = new int[2001];
            for (int sum = -1000; sum <= 1000; sum++) {
                if (dp[sum + 1000] > 0) {
                    next[sum + nums[i] + 1000] += dp[sum + 1000];
                    next[sum - nums[i] + 1000] += dp[sum + 1000];
                }
            }
            System.out.println(Arrays.toString(next));
            System.out.println(Arrays.toString(dp));
            dp = next;
        }
        return S > 1000 ? 0 : dp[S + 1000];
    }



    public static void main(String[] args) {

        int count = findTargetSumWays(new int[]{2,1,1,2}, 3);

        System.out.println(count);
    }
}
