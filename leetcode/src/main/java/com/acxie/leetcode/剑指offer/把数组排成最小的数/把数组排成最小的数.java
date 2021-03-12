package com.acxie.leetcode.剑指offer.把数组排成最小的数;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/9 10:34
 */

//输出结果可能非常大，所以你需要返回一个字符串而不是整数
//拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0

public class 把数组排成最小的数 {

//    public static String minNumber(int[] nums) {
//
//        //使用string的compareTo方法
//        int i = Arrays.stream(nums).boxed().sorted(
//                (o1, o2) -> {
//                    (o1 + o2).compareTo(o2 + o1)
//                }).reduce(0, (acc, item) -> {
//            acc = Integer.valueOf(acc + "" + item);
//            return acc;
//        }).intValue();
//        System.out.println(i);
//
//        return i + "";
//    }



    public static String minNumber(int[] nums) {

        //使用string的compareTo方法
        return Arrays.stream(nums).boxed().map(String::valueOf).sorted((o1, o2) -> (o1 + o2).compareTo(o2 + o1))
                .collect(Collectors.joining());

    }

    public static void main(String[] args) {
        int[] ints = {10, 2};
        String s = minNumber(ints);
        System.out.println(s);

    }
}

