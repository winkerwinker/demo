package com.acxie.leetcode.公司算法题.快手.魔法深渊;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @description:
 * @create: 2020/02/24 13:30
 */
public class 魔法深渊_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = null;
        int s = 0;
        int step = 0;
        while (n-- > 0) {
            s = Integer.parseInt(br.readLine());
            dp = new long[s + 1];
            dp[0] = 1;
            for (int i = 1; i <= s; i++) {
                step = 1;
                while (i - step >= 0) {
                    dp[i] += dp[i - step];
                    dp[i] %= 1000000003;
                    step = step * 2;
                }
            }
            System.out.println(dp[s]);
        }
        System.out.println(Arrays.toString(dp));
        return;
    }
}
