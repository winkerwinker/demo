package com.acxie.leetcode.leetcode算法题.岛屿数量;

import java.util.Stack;

/**
 * @description:广度优先搜索
 * @create: 2020/02/07 13:54
 */
public class 岛屿数量_1 {

    static int len;
    static int height;
    static Stack<Integer> stack = new Stack<Integer>();

    public static int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        len = grid.length;
        height = grid[0].length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < height; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    stack.push(i * height + j);
                    // grid1[i][j] = '0';
                    while (!stack.isEmpty()) {
                        int xy = stack.pop();
                        int x = xy / height;
                        int y = xy % height;
                        if (x < 0 || y < 0 || x >= len || y >= height || grid[x][y] == '0') {
                            continue;
                        }
                        grid[x][y] = '0';
                        if (x + 1 < len && grid[x + 1][y] == '1') stack.push((x + 1) * height + y);
                        if (y + 1 < height && grid[x][y + 1] == '1') stack.push(x * height + y + 1);
                        if (x - 1 >= 0 && grid[x - 1][y] == '1') stack.push((x - 1) * height + y);
                        if (y - 1 >= 0 && grid[x][y - 1] == '1') stack.push((x * height + y - 1));
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        char[][] grid3 = {
                {'1', '0', '0', '1', '0', '0', '0', '0', '1', '1', '1'}};

//        int numIslands1 = numIslands(grid1);
//        int numIslands2 = numIslands(grid2);
        int numIslands3 = numIslands(grid3);
//        System.out.println(numIslands1);
//        System.out.println(numIslands2);
        System.out.println(numIslands3);
    }
}