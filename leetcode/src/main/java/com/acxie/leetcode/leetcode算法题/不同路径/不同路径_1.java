package com.acxie.leetcode.leetcode算法题.不同路径;

import java.util.Arrays;

/**
 * @description:
 * @create: 2020/01/29 15:00
 */
public class 不同路径_1 {




    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[m - 1][n - 1];
    }




    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
}
