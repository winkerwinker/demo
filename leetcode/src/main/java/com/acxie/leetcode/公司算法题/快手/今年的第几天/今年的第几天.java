package com.acxie.leetcode.公司算法题.快手.今年的第几天;

import java.util.Scanner;

/**
 * @description:能被4整除的大多是闰年， 但能被100整除而不能被400整除的年份不是闰年，
 * @create: 2020/02/25 01:28
 */
public class 今年的第几天 {


    static int[] ping = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//    static int[] run = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int days = sc.nextInt();
        solution(year, month, days);
    }

    private static void solution(int year, int month, int days) {
        if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)) {
            ping[1] = 29;
        }
        int amount = 0;
        for (int i = 0; i < month - 1; i++) {
            amount += ping[i];
        }
        System.out.println(amount + days);

    }
}
