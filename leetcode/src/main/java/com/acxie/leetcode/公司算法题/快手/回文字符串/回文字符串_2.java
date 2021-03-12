package com.acxie.leetcode.公司算法题.快手.回文字符串;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:连续、DP实现
 * @create: 2020/02/22 15:25
 */
public class 回文字符串_2 {

    public static String max_reverse(String s) {
        int n = s.length();
        if (n < 2) return s;
        int maxLen = 1;
        String res = s.substring(0, 1);
        boolean[][] dp = new boolean[n][n];
        //左边界一定小于右边界，因此从右边界开始
        for (int r = 1; r < n; r++) { //表示右边界
            for (int l = 0; l < r; l++) { //表示左边界
                // 区间应该慢慢放大
                // 状态转移方程：如果头尾字符相等并且中间也是回文
                // 在头尾字符相等的前提下，如果收缩以后不构成区间（最多只有 1 个元素），直接返回 True 即可
                // 否则要继续看收缩以后的区间的回文性
                System.out.println(  Arrays.deepToString(dp));
                if (s.charAt(l) == s.charAt(r) && ((r - l) <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        res = s.substring(l, r + 1);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(max_reverse("babadd"));
    }


}


/**
 * 方法二：动态规划
 * 求解 "最优子结构" 问题，可以考虑用 "动态规划"
 */