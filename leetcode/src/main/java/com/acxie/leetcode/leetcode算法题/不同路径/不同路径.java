package com.acxie.leetcode.leetcode算法题.不同路径;

/**
 * @description:
 * @create: 2020/01/29 15:00
 */
public class 不同路径 {

    static int[][] a = new int[101][101];


    public static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        if (a[m][n] != 0) return a[m][n];
        int ans = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        a[m][n] = ans;
        a[n][m] = ans;
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
}
