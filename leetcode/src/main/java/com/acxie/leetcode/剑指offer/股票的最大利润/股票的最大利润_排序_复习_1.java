package com.acxie.leetcode.剑指offer.股票的最大利润;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/14 19:17
 */

public class 股票的最大利润_排序_复习_1 {


    //排序双指针
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }
            max = Math.max(prices[i] - min, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int i = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);
    }

}
