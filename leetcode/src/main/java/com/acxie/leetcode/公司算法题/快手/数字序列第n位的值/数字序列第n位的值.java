package com.acxie.leetcode.公司算法题.快手.数字序列第n位的值;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/25 01:40
 */
public class 数字序列第n位的值 {


    static int[] dp = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        dp[1] = 1;
        dp[2] = 3;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = i + dp[i - 1];
            if (dp[i] >= a) {
                System.out.println(i);
                System.exit(0);
            }
        }

        System.out.println(Arrays.toString(dp));

    }
}
