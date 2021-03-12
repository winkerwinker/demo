package com.acxie.leetcode.公司算法题.深信服.长方体的摆放;//package 公司算法题.深信服.长方体的摆放;
//
//import java.util.List;
//import java.util.Scanner;
//
///**
// * @description:
// * @create: 2020/02/20 18:47
// */
//public class 长方体的摆放 {
//
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int target=sc.nextInt();
//        int[] ints=new int[]{};
//        for (int i = 0; i <3 ; i++) {
//            ints[i]=sc.nextInt();
//        }
//
//        test(target,ints);
//
//
//    }
//
//    private static void test(int target, int[] ints) {
//        if (m > n) {
//            return 0;
//        }
//        if (m == 0) {
//            return 1;
//        }
//
//        return demo(n - 1, m - 1) + demo(n - 1, m);
//
//    }
//}
//
