package com.acxie.leetcode.公司算法题.快手.回文字符串;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:可以不连续
 * @create: 2020/02/22 15:25
 */
public class 回文字符串 {


    public static int max_reverse(String s) {

        if (s.length() < 2) {
            return s.length();
        }
        int[][] dp = new int[s.length()][s.length()];
        int max = 1;
        for (int right = 1; right < s.length(); right++) {
            for (int left = right; left >= 0; left--) {

                if (left == right) {
                    dp[left][right] = 1;
                } else if (right - left == 1 && s.charAt(left) == s.charAt(right)) {
                    dp[left][right] = 2;
                } else if (s.charAt(left) == s.charAt(right)) {
                    dp[left][right] = dp[left + 1][right - 1] + 2;
                } else {
                    dp[left][right] = Math.max(dp[left + 1][right], dp[left][right - 1]);
                }
                max = Math.max(dp[left][right], max);
            }

        }
        System.out.println(Arrays.deepToString(dp));
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.next();
        System.out.println(max_reverse("abcbbbbbbbaaaaabakdflsfjdssfhdksafldhsfkdashlfh123213123213akldfjsldfjsa123123A"));
    }

}
