package com.acxie.leetcode.公司算法题.携程;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020/01/28 19:34
 */
public class 获取有多少个1bit {

    public static int test(long num) {


        int count = 0;
        while (num != 0) {
            num = num & num - 1;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        System.out.println(test(a));

    }

}
