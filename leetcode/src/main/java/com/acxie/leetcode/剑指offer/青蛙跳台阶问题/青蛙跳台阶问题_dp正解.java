package com.acxie.leetcode.剑指offer.青蛙跳台阶问题;

import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/2 21:59
 */
//dp 正常会导致超时,所以需要倒着计算 斐波那契数列
public class 青蛙跳台阶问题_dp正解 {

    static long[] dp = new long[]{};

    //答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
    public static int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n <= 2) {
            return n;
        }
        dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        return (int) (numWays1(n));
    }

    public static long numWays1(int n) {
        for (int i = 3; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    public static void main(String[] args) {
        long result = numWays(92);
        System.out.println(result);
    }
}