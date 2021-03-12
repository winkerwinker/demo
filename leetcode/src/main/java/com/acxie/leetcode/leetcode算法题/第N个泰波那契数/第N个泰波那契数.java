package com.acxie.leetcode.leetcode算法题.第N个泰波那契数;

public class 第N个泰波那契数 {


    int dp[] = new int[38];

    public static void main(String[] args) {


    }

    public int tribonacci(int n) {

        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (dp[n] == 0) {
            int temp = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
            dp[n] = temp;
            return temp;
        }

        return dp[n];


    }
}
