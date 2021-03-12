package com.acxie.leetcode.leetcode算法题.位1的个数;

/**
 * @description: 不用转正数、直接使用位运算
 * @create: 2020/01/28 20:11
 */
public class 位1的个数_2 {


    public static int hammingWeight(long num) {

        int count = 0;
        while (num != 0) {
            //依次判断最低位是否是 1，
            if ((num & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                count++;
            }
            num <<= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Long.toBinaryString(-7247555541308586214L));
        System.out.println(Long.toBinaryString(Long.MIN_VALUE));
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));
        System.out.println(Long.toBinaryString(-5L));
//        System.out.println(Long.toBinaryString(1L));
        System.out.println(hammingWeight(-5L));


    }

}
