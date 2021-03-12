package com.acxie.leetcode.leetcode算法题.位1的个数;

/**
 * @description: 普通
 * @create: 2020/01/28 20:11
 */
public class 位1的个数_1 {


    public static int hammingWeight(int num) {
        String str = Integer.toBinaryString(num);
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='1') count++;
        }
        return  count;
    }


    public static void main(String[] args) {
        System.out.println(Long.toBinaryString(-7247555541308586214L));
        System.out.println(Long.toBinaryString(-6L));
        System.out.println(Long.toBinaryString(5L));
//        System.out.println(Long.toBinaryString(1L));
        System.out.println(hammingWeight(-79469));

    }

}
