package com.acxie.leetcode.公司算法题.快手.最少数量货物装箱问题;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/23 22:46
 */
public class 最少数量货物装箱问题_1 {



    private static int solution(int X) {
        if ( X == 4 || X < 3) {
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
        int y = solution(X - 5);
        int z = solution(X - 7);


        int reuslt = 1 + Math.min(Math.min(x, y), z);
        return reuslt;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = solution(sc.nextInt());
        if (a > 0) System.out.println(a);
        else System.out.println(-1);
    }


}
