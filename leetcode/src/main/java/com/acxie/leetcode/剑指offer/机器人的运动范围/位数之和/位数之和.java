package com.acxie.leetcode.剑指offer.机器人的运动范围.位数之和;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/9 15:44
 */

//它每次可以向左、右、上、下移动一格（不能移动到方格外） BFS 和 DFS搜索
public class 位数之和 {

    public static void main(String[] args) {
        int x = 108;
        System.out.println(sum(x));
    }

    private static int sum(int x) {
        int s = 0;
        while (x > 0) {
            s += x % 10;
            x = x / 10;
        }
        return s;
    }


}