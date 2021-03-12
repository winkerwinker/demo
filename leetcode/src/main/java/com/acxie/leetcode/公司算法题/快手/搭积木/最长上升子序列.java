package com.acxie.leetcode.公司算法题.快手.搭积木;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @create: 2020/02/24 22:47
 */
public class 最长上升子序列 {


    public static void main(String[] args) {
        System.out.println(solution(Arrays.asList(7, 9, 8, 3, 4, 5, 6, 7)));
    }

    private static int solution(List<Integer> list) {
        if (list.size() < 2) return list.size();
        int max = 1;
        int[] dp = new int[list.size()];
        dp[0] = 1;
        for (int i = 1; i < list.size(); i++) {
            int temp = 1;
            for (int j = 0; j < i; j++) {
                if (list.get(i) >= list.get(j)) {
                    temp = Math.max(temp, dp[j] + 1);
                }
            }
            dp[i] = temp;
            max = Math.max(temp,max);
        }
//        System.out.println(Arrays.toString(dp));
        return max;
    }
}
