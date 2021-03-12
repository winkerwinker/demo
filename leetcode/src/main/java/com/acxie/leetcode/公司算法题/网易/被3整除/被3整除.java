package com.acxie.leetcode.公司算法题.网易.被3整除;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/07 18:44
 */
public class 被3整除 {


    public static void solution(int start, int end) {
        int tail;
        if (end % 3 == 1) {
            tail = 0;
        } else if (end % 3 == 0) {
            tail = 0;
        } else {
            tail = 1;
        }
        int total = end / 3 * 2 + tail;
        System.out.println(total);

        if ((start - 1) % 3 == 1) {
            tail = 0;
        } else if ((start - 1) % 3 == 0) {
            tail = 0;
        } else {
            tail = 1;
        }
        int sub = (start - 1) / 3 * 2 + tail;
        System.out.println(sub);

        System.out.println(total - sub);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        solution(start, end);
    }


}

//FALSE

// System.out.println(Math.pow(10, 9) > Integer.MAX_VALUE);