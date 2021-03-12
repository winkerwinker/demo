package com.acxie.leetcode.leetcode算法题.位1的个数;

/**
 * @description: 在二进制表示中，数字 nn 中最低位的 11 总是对应 n - 1n−1 中的 00 。
 * 因此，将 nn 和 n - 1n−1 与运算总是能把 nn 中最低位的 11 变成 00 ，并保持其他位不变。
 * @create: 2020/01/28 20:11
 */
public class 位1的个数_4 {



    public static int hammingWeight(int num) {

            int count = 0;
            while (num != 0) {
               num=num&num-1;
               count++;
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
