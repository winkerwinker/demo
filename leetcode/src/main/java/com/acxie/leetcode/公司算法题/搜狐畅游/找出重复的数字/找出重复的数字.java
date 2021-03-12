package com.acxie.leetcode.公司算法题.搜狐畅游.找出重复的数字;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/25 16:10
 */
public class 找出重复的数字 {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(new Scanner(System.in).nextLine().split(" ")).stream().map(A -> Integer.valueOf(A)).collect(Collectors.toList());
        System.out.println(a);
        int total = (int) ((a.size() - 1) * (((double) a.size() - 2) / 2));
        System.out.println(total);
        System.out.println(a.stream().reduce(0, (acc, item) -> {
                    return acc + item;
                }
        ) - total);
    }

//    private static int solution(List<Integer> collect) {
//    }
}
