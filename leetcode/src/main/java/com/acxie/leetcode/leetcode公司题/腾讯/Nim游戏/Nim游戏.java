package com.acxie.leetcode.leetcode公司题.腾讯.Nim游戏;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/16 15:55
 */


//给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
//原地 修改输入数组

public class Nim游戏 {

    public static boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

    public static void main(String[] args) {
        boolean b = canWinNim(7);
        System.out.println(b);

    }
}
