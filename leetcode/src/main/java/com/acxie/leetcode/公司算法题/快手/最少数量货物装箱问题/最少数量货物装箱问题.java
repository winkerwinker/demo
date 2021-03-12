package com.acxie.leetcode.公司算法题.快手.最少数量货物装箱问题;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/23 22:46
 */
public class 最少数量货物装箱问题 {


    static int[] ints = new int[10001];

    private static int solution(int X) {
        if (ints[X] != 0) {
            return ints[X];
        }
        if (ints[X] == -1 || X == 4 || X < 3) {
            return Integer.MIN_VALUE;
        }
        if (X == 3) {
            return 1;
        }
        if (X == 5) {
            return 1;
        }
        if (X == 7) {
            return 1;
        }


        int x = solution(X - 3);
        ints[X - 3] = x < 0 ? -1 : x;
        int y = solution(X - 5);
        if (y < 0) ints[X - 5] = -1;
        ints[X - 5] = y < 0 ? -1 : y;
        int z = solution(X - 7);
        ints[X - 7] = z < 0 ? -1 : z;


        int reuslt = 1 + Math.max(Math.max(x, y), z);
        return reuslt;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = solution(sc.nextInt());
        if (a > 0) System.out.println(a);
        else System.out.println(-1);
    }


}
