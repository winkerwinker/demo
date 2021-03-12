package com.acxie.leetcode.公司算法题.橙心优选.最长公共子序列;

/**
 * "ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。两个字符串的「公共子序列」是这两个字符串所共同拥有的子序列。
 * 不是连续子序列
 * 1. 枚举所有subseq
 * 2. 暴力
 */

public class 最长公共子序列1 {

    public static int longestCommonSubsequence(String text1, String text2) {
        // 如果有一个是空，那么最长公共子序列是，会有默认是0

        //需要有一行空0
        // 需要根据左边和上边的得出结论、 演进顺序是肯定的
        int dp[][] = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 0; i < text1.length(); i++) {
            //对每一个结点，选择使用或者不使用
            for (int j = 0; j < text2.length(); j++) {
                //可以优化成只保存上面一行
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }

    public static void main(String[] args) {
        int i = longestCommonSubsequence("abcde", "ace");
        System.out.println(i);
    }
}
