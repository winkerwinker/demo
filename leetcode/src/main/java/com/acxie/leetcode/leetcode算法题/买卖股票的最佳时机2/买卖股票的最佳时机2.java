package com.acxie.leetcode.leetcode算法题.买卖股票的最佳时机2;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/19 11:13
 */


//设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
//找到所有上涨趋势的股票


public class 买卖股票的最佳时机2 {


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
        int i = maxProfit(new int[]{7,6,4,3,1});
        System.out.println(i);

    }
}
