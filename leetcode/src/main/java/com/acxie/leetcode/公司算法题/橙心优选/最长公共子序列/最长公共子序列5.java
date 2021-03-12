package com.acxie.leetcode.公司算法题.橙心优选.最长公共子序列;

/**
 * "ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。两个字符串的「公共子序列」是这两个字符串所共同拥有的子序列。
 * 不是连续子序列
 * 1. 枚举所有subseq
 * 2. 暴力
 */

public class 最长公共子序列5 {

    public static int max;

    public static int subSeq(String s1, String s2) {

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }




    public static void main(String[] args) {
        int i = subSeq("bdfcq", "bqdfc");
        System.out.println(i);
    }
}
