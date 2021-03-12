package com.acxie.leetcode.剑指offer.股票的最大利润;


import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/14 19:17
 */

public class 股票的最大利润_排序 {


//     [7,1,5,3,6,4]

    public static int maxProfit(int[] prices) {
        // 放入hash表得到index; 是多值的hash map

        int[] ints = Arrays.stream(prices).sorted().toArray();
        System.out.println(Arrays.toString(ints));
        int i = 0;
        int k = prices.length;
        int maxProfit = -1;
        while (maxProfit == -1) {
//            if ()

        }

        return -1;
    }

    public static void main(String[] args) {
        int i = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }

}
