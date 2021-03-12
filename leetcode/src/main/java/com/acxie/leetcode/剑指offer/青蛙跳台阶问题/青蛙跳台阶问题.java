package com.acxie.leetcode.剑指offer.青蛙跳台阶问题;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/2 21:59
 */
//dp 正常会导致超时,所以需要倒着计算
public class 青蛙跳台阶问题 {

    static int[] dp = new int[]{};

    //答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
    public static int numWays(int n) {

        return numWays1(n) % 1000000008;
    }

    public static int numWays1(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        //为什么没有这一行会栈溢出
        if (n == 2) return 2;
//        int count =
//        dp[n] = count;
//        System.out.println(Arrays.toString(dp));
        return numWays1(n - 1) + numWays1(n - 2);
    }

    public static void main(String[] args) {
        int result = numWays(0);
        System.out.println(result);
    }
}
