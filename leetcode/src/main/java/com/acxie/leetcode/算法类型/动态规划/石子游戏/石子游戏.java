package com.acxie.leetcode.算法类型.动态规划.石子游戏;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/4 15:31
 */


//双人博弈类dp总结- xing-xing - 博客园www.cnblogs.com › xingxing1024
//2016年2月6日 - 双人博弈类dp总结. 实例1：（USACO A Game）. 有一列数排列， 甲乙两个人每次可以从头或者从末尾取一个数， 问甲乙在采取最优策略的基础 ...
//偶数堆，先手必赢，直接 return true.

public class 石子游戏 {


    //先手可以一直控制自己拿下标全为奇数或者全为偶数的石子，所以只要提前计算好偶数下标与奇数下标各自的总和，选大的那一方拿就必胜


    public static boolean stoneGame(int[] piles) {
        stoneGame1(piles, 0, piles.length - 1);
        return false;
    }

    public static int stoneGame1(int[] piles, int from, int to) {
        if (from < 0 || from >= piles.length || to < 0 || to >= piles.length) return 0;
        if (from == to) return piles[from];
        return Math.max(piles[from] + stoneGame1(piles, from + 2, to), piles[to] + stoneGame1(piles, from, to - 2));
    }


    //两个人都使用dp博弈

    public static void main(String[] args) {
        int[] piles = new int[]{5, 3, 4, 5};

        int i = stoneGame1(piles, 0, piles.length - 1);
        System.out.println(i);
    }
}
