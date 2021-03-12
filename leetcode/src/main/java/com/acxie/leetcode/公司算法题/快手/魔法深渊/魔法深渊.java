package com.acxie.leetcode.公司算法题.快手.魔法深渊;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/24 13:30
 */
public class 魔法深渊 {
    static long[] ints = new long[1001];


    private static long solution(int target) {
        if (target == 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
//        if (target == 3) return 3;
//        if (target == 4) return 5;
        if (ints[target] != 0) return ints[target];


        int x = (int) (Math.log(target) / Math.log(2));
        long total = 0;
        if (target == Math.pow(2, x)) {
            total++;
            x--;
        }

        for (int i = 0; i <= x; i++) {
            long temp = solution((int) (target - Math.pow(2, i))) ;
            ints[(int) (target - Math.pow(2, i))] = temp ;
            total += temp;
        }

        return total % 1000000003;
    }

//为了防止溢出，可将输出对10^9 + 3取模
    public static void main(String[] args) {
        ints[1] = 1;
        ints[2] = 2;
        ints[3] = 3;
        ints[4] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
        System.out.println(Arrays.toString(ints));
    }
}
