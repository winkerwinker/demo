package com.acxie.leetcode.leetcode算法题.位1的个数;

/**
 * @description:
 * @create: 2020/01/28 20:11
 */
public class 位1的个数_3 {



    public static int hammingWeight(int num) {

            int count = 0;
            while (num != 0) {
                //依次判断最低位是否是 1，
                num >>>= 1;
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(Long.toBinaryString(-7247555541308586214L));
        System.out.println(Long.toBinaryString(-6L));
        System.out.println(Long.toBinaryString(5L));
//        System.out.println(Long.toBinaryString(1L));
        System.out.println(hammingWeight(-79469));


    }

}
