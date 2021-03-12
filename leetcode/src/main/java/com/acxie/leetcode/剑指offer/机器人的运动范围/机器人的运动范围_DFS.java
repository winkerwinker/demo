package com.acxie.leetcode.剑指offer.机器人的运动范围;

import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/9 15:44
 */

//它每次可以向左、右、上、下移动一格（不能移动到方格外） BFS 和 DFS搜索
public class 机器人的运动范围_DFS {

    static boolean[][] booleans;
    static int count = 0;

    public static int movingCount(int m, int n, int k) {
        booleans = new boolean[m][n];
        count = 0;
        movingCount1(m, n, 0, 0, k);
        return count;
    }

    public static void movingCount1(int m, int n, int i, int j, int k) {
        //因为是三角形所以不用再向上搜索
        System.out.println(Arrays.deepToString(booleans));
        if (j == 12) {
            System.out.println(11);
        }
        if (isSatisfy(m, n, i, j, k)) {
            booleans[i][j] = true;
            count++;
        } else {
            return;
        }
        //DFS
        movingCount1(m, n, i + 1, j, k);
        movingCount1(m, n, i, j + 1, k);
    }


    private static boolean isSatisfy(int m, int n, int i, int j, int k) {

        if (i == 9 || j == 9) {
            System.out.println(22);
        }
        return isIn(m, n, i, j) && isNotBeen(i, j) && isOk(i, j, k);

    }

    private static boolean isIn(int m, int n, int i, int j) {

        return i >= 0 && j >= 0 && i < m && j < n;

    }


    private static boolean isNotBeen(int i, int j) {
        return !booleans[i][j];
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
