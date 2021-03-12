package com.acxie.leetcode.剑指offer.机器人的运动范围;

import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/9 15:44
 */

//它每次可以向左、右、上、下移动一格（不能移动到方格外） BFS 和 DFS搜索
//todo 写一个BFS
public class 机器人的运动范围_DFS_官方 {

    // 关于代码的优化
    static boolean[][] booleans;

    public static int movingCount(int m, int n, int k) {
        booleans = new boolean[m][n];
        return movingCount1(m, n, 0, 0, k);
    }

    public static int movingCount1(int m, int n, int i, int j, int k) {
        //因为是三角形所以不用再向上搜索
        boolean satisfy = isSatisfy(m, n, i, j, k);
        if (satisfy) {
            return 0;
        }
        return satisfy ? 1 : 0 + movingCount1(m, n, i + 1, j, k) + movingCount1(m, n, i, j + 1, k);

    }


    private static boolean isSatisfy(int m, int n, int i, int j, int k) {

        return isIn(m, n, i, j) && isNotBeen(i, j) && isOk(i, j, k);

    }

    private static boolean isIn(int m, int n, int i, int j) {

        return i >= 0 && j >= 0 && i < m && j < n;

    }


    private static boolean isNotBeen(int i, int j) {
        boolean b = booleans[i][j];
        booleans[i][j] = true;
        return !b;
    }


    private static boolean isOk(int x, int y, int k) {
        return sum(x) + sum(y) <= k;
    }

    private static int sum(int x) {
        int s = 0;
        while (x > 0) {
            s += x % 10;
            x = x / 10;
        }
        return s;
    }


    public static void main(String[] args) {
        int repeatNumber = movingCount(1, 1, 0);
        System.out.println(repeatNumber);
    }
}
