package com.acxie.leetcode.leetcode算法题.汉明距离;

/**
 * @description: 普通
 * @create: 2020/01/30 19:43
 */
public class 汉明距离 {

    public static int hammingDistance(int x, int y) {
        //注意
       int a= x ^ y;
        System.out.println(a);
       //有几个1的问题
        int count =0;
        while (a!=0){
            a=a&a-1;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {

        System.out.println(hammingDistance(1, 4));

    }
}
