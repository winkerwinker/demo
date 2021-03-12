package com.acxie.leetcode.剑指offer.二进制中1的个数;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/14 19:00
 */

public class 二进制中1的个数 {


    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }


//    public int hammingWeight(int n) {
//        int res = 0;
//        while(n != 0) {
//            res += n & 1;
//            n >>>= 1;
//        }
//        return res;
//    }


    public static void main(String[] args) {
//        int i1 = Double.parseDouble("11111111111111111111111111111101", 2);
        int i = 1;
        int i1 = i = hammingWeight(i);
        System.out.println(i1);


    }
}
