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
public class 一和零1 {


    //说起来是dp，其实就是暴力迭代。dp就是带备忘录的暴力循环
    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int zeros = 0;
            int ones = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }

            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    int zeroLeft = i - zeros;
                    int oneLeft = j - ones;
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[zeroLeft][oneLeft]);
                }
            }
            System.out.println("-----------------------");
            System.out.print(Arrays.deepToString(dp) + "\n");

        }
        return dp[m][n];
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
        String[] a = new String[]{"10", "0001", "111001", "1", "0"};
        findMaxForm(a, 5, 3);
    }
}
