package com.acxie.leetcode.leetcode算法题.腐烂的橘子;

import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/21 18:13
 */

public class 腐烂的橘子 {

    static int count = 0;
    static int tempNow2 = 0;

    public static int orangesRotting(int[][] grid) {
        //烂掉而且已经传染掉的设置为3
        count = 0;
        tempNow2 = 0;


        //二维数组转一维数组
        //计算所有的count
        int count1 = (int) Arrays.stream(grid).flatMapToInt(x -> Arrays.stream(x)).filter(a -> a == 1).count();
        int now2 = (int) Arrays.stream(grid).flatMapToInt(x -> Arrays.stream(x)).filter(a -> a == 2).count();

        boolean flag = true;
        int min = 0;
        //如果没有再变化了，把flag设为false
        while (flag) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 2) {
                        //四个方向传染
                        //所有的都会腐烂
                        flag = spread(grid, i, j);
                        grid[i][j] = 3;
                        if (now2-- == 0) {
                            min++;
                            now2 = tempNow2;
                            tempNow2 = 0;
                        }
                        System.out.println(Arrays.deepToString(grid));
                    }
                }
            }

            if (count1 == count) {
                return min;
            }
        }
        //无法腐烂到
        return -1;
    }

    // 如何设计四个方向的算法
    public static boolean spread(int[][] grid, int i, int j) {
        //+1 -1
        // 需要设置成非短路的结构
        return spread1(grid, i - 1, j) |
                spread1(grid, i, j - 1) |
                spread1(grid, i + 1, j) |
                spread1(grid, i, j + 1);
    }


    public static boolean spread1(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length) {
            if (grid[i][j] == 1) {
                //使用dfs 或者 bfs
                grid[i][j] = 2;
                tempNow2++;
                count++;
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}};
        int i = orangesRotting(grid);
        System.out.println(i);


    }

}