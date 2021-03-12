package com.acxie.leetcode.剑指offer.n个骰子的点数;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/4 14:00
 */

public class
n个骰子的点数 {

    static int nums;
    static double[][] dp;

    //    n 是层数
    public static double[] twoSum(int n) {
        nums = n;
        dp = new double[n][n * 6];
        //需要改成double（1/6） 才会ac
        dp[0] = new double[]{0.16667, 0.16667, 0.16667, 0.16667, 0.16667, 0.16667};
        double[] doubles = Arrays.stream(twoSum1(2)).filter(a -> 0.0 != a).toArray();
        return doubles;
    }

    public static double[] twoSum1(int n) {
        if (n == nums + 1) return dp[n - 2];
        for (int i = 1; i < n * 6 + 1; i++) {
            if (i == 7) System.out.println(11);
            //应该用一个函数来表示越界
            dp[n - 1][i - 1] = (double) 1 / 6 * (fun(n - 1, i - 1) + fun(n - 1, i - 2) + fun(n - 1, i - 3) + fun(n - 1, i - 4) + fun(n - 1, i - 5) + fun(n - 1, i - 6));
        }
        return twoSum1(n + 1);
    }


    public static double fun(int n, int last) {
        //当传入12的时候会out of
        if (last <= 0 || last > n * 6) return 0;
        return dp[n - 1][last - 1];
    }


    public static void main(String[] args) {
        double[] doubles = twoSum(3);
        System.out.println(Arrays.toString(doubles));
    }
}







