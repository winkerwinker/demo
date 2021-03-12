package com.acxie.leetcode.leetcode算法题.一和零;

import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/2 16:33
 */

//在计算机界中，我们总是追求用有限的资源获取最大的收益。
//现在，假设你分别支配着 m 个0和 n 个1。另外，还有一个仅包含0和1字符串的数组。
//你的任务是使用给定的m 个0和 n 个1，找到能拼出存在于数组中的字符串的最大数量。每个0和1至多被使用一次。

//多维数组的背包问题
public class 一和零 {


    //说起来是dp，其实就是暴力迭代。dp就是带备忘录的暴力循环
    public static int findMaxForm(String[] strs, int m, int n) {
        if (strs.length == 0) {
            return 0;
        }
        //需要确定初始化大小
        int[][] dp = new int[m + 1][n + 1];//多维费用问题的0-1背包问题。dp[i][j]表示使用i个0和j个1能表示的字符串的最大数量
        //todo 重点,顺序没关系!顺序没关系
        for (String str : strs) {
            int zeros = count(str);
            int ones = str.length() - zeros;
            if (m + 1 >= zeros && n + 1 >= ones) {
                dp[m][n] = Math.max(dp[m - zeros][n - ones] + 1, dp[n][m]);
            }
        }
        System.out.printf(Arrays.toString(dp));
        return 1;
    }

    private static int count(String str) {
        int result = 0;
        for (char c : str.toCharArray()) {
            if ('0' == c) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        String[] a = new String[]{"10", "0001", "111001", "1", "0"};
        String[] a = new String[]{"10", "0", "1"};
        int maxForm = findMaxForm(a, 1, 1);
        System.out.println(maxForm);
    }
}
