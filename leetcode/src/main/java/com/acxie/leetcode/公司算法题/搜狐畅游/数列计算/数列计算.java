package com.acxie.leetcode.公司算法题.搜狐畅游.数列计算;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/25 16:23
 */
//todo（注意在所有测试数据中，结果均不会超过2.1*10^9）
public class 数列计算 {
    static int[] ints = new int[1001];

    public static void main(String[] args) {
        ints[0] = 0;
        ints[1] = 1;
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt(), sc.nextInt());
    }

    private static void solution(int standard, int index) {
        int now = 2;
        int copynow = now;
        int flag = 1;
        while (now <= 1000) {
            copynow = now;
            flag *= standard;
            for (int i = 0; now <= 1000 && i < copynow; i++) {
                if (now == index) {
                    System.out.println(ints[i] + flag);
                    return;
                }
                ints[now++] = ints[i] + flag;

            }
        }

        System.out.println(Arrays.toString(ints));

        return;
    }


}
