package com.acxie.leetcode.leetcode算法题.最佳买卖股票时机含冷冻期;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/19 11:23
 */

public class 最佳买卖股票时机含冷冻期 {

    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            maxProfit += Math.max(prices[i + 1] - prices[i], 0);
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int i = maxProfit(new int[]{1, 2, 3, 0, 2});
        System.out.println(i);

    }
}
