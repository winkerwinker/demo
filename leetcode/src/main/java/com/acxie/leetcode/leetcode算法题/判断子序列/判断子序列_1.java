package com.acxie.leetcode.leetcode算法题.判断子序列;

/**
 * @description: 使用DP动态规划
 * @create: 2020/01/28 15:20
 */
public class 判断子序列_1 {

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return s.length() == i;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("leeeeetcode", "yyyyylyyyyyyyyyyy"));
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

}
