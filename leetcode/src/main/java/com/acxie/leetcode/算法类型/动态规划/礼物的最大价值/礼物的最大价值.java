package com.acxie.leetcode.算法类型.动态规划.礼物的最大价值;

import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/2 17:27
 */

public class 礼物的最大价值 {

    public static int maxValue(int[][] grid) {
        if (grid.length == 0) return 0;

        //todo 很好用,初始化全部为0的数组
//        int[] ten = {0, 0, 0};
//        int[] ten1 = {0, 0, 0};
//        int[] ten2 = {0, 0, 0};
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {//之前出现过使用Arrays.fill导致指向引用的问题
                    dp[i][j] = grid[i][j];
                } else if (i == 0) {
                    dp[i][j] = grid[i][j] + dp[i][j - 1];
                } else if (j == 0) {
                    dp[i][j] = grid[i][j] + dp[i - 1][j];
                } else {
                    //如果数组越界就是0
                    dp[i][j] = grid[i][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                System.out.printf(Arrays.deepToString(dp) + "\n");
            }


        }
        return dp[0][0];
    }


    public static void main(String[] args) {
        int[] int1 = new int[]{1, 3, 1};
        int[] int2 = new int[]{1, 5, 1};
        int[] int3 = new int[]{4, 2, 1};
        int[][] grid = new int[][]{int1, int2, int3};
        System.out.println(Arrays.deepToString(grid));
        maxValue(grid);
    }
}
