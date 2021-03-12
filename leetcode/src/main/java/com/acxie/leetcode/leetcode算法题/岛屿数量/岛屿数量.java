package com.acxie.leetcode.leetcode算法题.岛屿数量;

/**
 * @description:深度优先搜索
 * @create: 2020/02/07 13:54
 */
public class 岛屿数量 {

    static int len;
    static int height;
    static char[][] grid1;

    public static int numIslands(char[][] grid) {
        len = grid.length;
        height = grid[0].length;
        grid1 = grid;
        int count = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < height; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(i, j);
                }
            }
        }

        return count;
    }


    public static void dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= len || y >= height || grid1[x][y] == '0') {
            return;
        }
        grid1[x][y] = '0';
        if (x + 1 < len && grid1[x + 1][y] == '1') dfs(x + 1, y);
        if (y + 1 < height && grid1[x][y + 1] == '1') dfs(x, y + 1);
        if (x - 1 >= 0 && grid1[x - 1][y] == '1') dfs(x - 1, y);
        if (y - 1 >= 0 && grid1[x][y - 1] == '1') dfs(x, y - 1);
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

        int numIslands1 = numIslands(grid1);
        int numIslands2 = numIslands(grid2);
        System.out.println(numIslands1);
        System.out.println(numIslands2);


    }
}
