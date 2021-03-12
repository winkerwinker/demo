package com.acxie.leetcode.leetcode算法题.岛屿数量;

/**
 * @description:广度优先搜索
 * @create: 2020/02/07 13:54
 */
public class 岛屿数量_2 {

    static int len;
    static int height;

    // TODO: 2020-02-07 并查集 
    public static int numIslands(char[][] grid) {
        int count = 0;

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