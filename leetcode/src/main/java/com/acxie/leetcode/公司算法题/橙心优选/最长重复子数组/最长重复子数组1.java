package com.acxie.leetcode.公司算法题.橙心优选.最长重复子数组;

/**
 * 错误表示
 * 注意对比 公司算法题.橙心优选.最长公共子序列
 * @create: 2021/01/24 18:18
 */
public class 最长重复子数组1 {


    public static int findLength(int[] A, int[] B) {

        int[][] dp = new int[A.length + 1][B.length + 1];

        int max = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                }
                max = Math.max(max, dp[i + 1][j + 1]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int length = findLength(new int[]{}, new int[]{1});
        System.out.println(length);
    }


}

