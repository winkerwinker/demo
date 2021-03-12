package com.acxie.leetcode.公司算法题.蘑菇街.输出指定长度子串;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/25 03:38
 */
public class 输出指定长度子串 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String a = sc.nextLine();
            int b = sc.nextInt();
            if (b < 1) {
                System.out.println(-1);
                return;
            }
            solution(a, b);
            //todo 用于输出用例
        } catch (Exception e) {
            System.out.println();
        }
    }

    private static void solution(String str, int k) {
        if (str.length() < k) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i <= str.length() - k; i++) {
            if (i != str.length() - k) {
                System.out.print(str.substring(i, i + k) + " ");
            } else {
                System.out.print(str.substring(i, i + k));
            }
        }
    }
}
