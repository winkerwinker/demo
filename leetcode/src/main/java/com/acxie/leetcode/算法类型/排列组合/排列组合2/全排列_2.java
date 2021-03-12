package com.acxie.leetcode.算法类型.排列组合.排列组合2;

import java.util.Arrays;

/**
 * @description:普通
 * @create: 2020/02/01 17:58
 */
public class 全排列_2 {


    public static void Permutation(char chs[], int start) {
        if (start == chs.length - 1) {
            System.out.println(Arrays.toString(chs));
            //如果已经到了数组的最后一个元素，前面的元素已经排好，输出。
        }
        for (int i = start; i <= chs.length - 1; i++) {
            //把第一个元素分别与后面的元素进行交换，递归的调用其子数组进行排序
            Swap(chs, i, start);
            Permutation(chs, start + 1);
            Swap(chs, i, start);
            //子数组排序返回后要将第一个元素交换回来。
            //如果不交换回来会出错，比如说第一次1、2交换，第一个位置为2，子数组排序返回后如果不将1、2
            //交换回来第二次交换的时候就会将2、3交换，因此必须将1、2交换使1还是在第一个位置
        }
    }

    /**
     * 不能直接拿数字，要拿数组和下标去交换
     */

    public static void Swap(char chs[], int i, int j) {
        char temp;
        temp = chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }


    public static void main(String[] args) {
        char[] nums = {'1', '2', '3', '4'};
        Permutation(nums, 0);
    }
}
