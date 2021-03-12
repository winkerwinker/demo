package com.acxie.leetcode.剑指offer.股票的最大利润;

import org.checkerframework.checker.units.qual.min;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/14 19:17
 */

public class 股票的最大利润_dp {


//[7,1,5,3,6,4]
//前i日最大利润=max(前(i−1)日最大利润,第i日价格−前i日最低价格)
//前i日最低价格
//dp[i] = \max(dp[i - 1], prices[i] - \min(prices[0:i]))
//dp[i]=max(dp[i−1],prices[i]−min(prices[0:i]))

//
//    public static int maxProfit(int[] prices) {
//
//    }
//    public static void main(String[] args) {
//        int i = maxProfit(new int[]{5, 6});
//        System.out.println(i);
//    }


}
