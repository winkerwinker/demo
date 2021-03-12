package com.acxie.leetcode.公司算法题.快手.求连续子数组的最大和;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/25 01:09
 */
public class 求连续子数组的最大和 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.asList(sc.nextLine().split(",")).stream().map(A -> Integer.valueOf(A)).collect(Collectors.toList());
        System.out.println(solution(list));
    }

    private static int solution(List<Integer> list) {
        //todo max =integer.min
        int max = 0;
        int now = 0;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(now + list.get(i), max);
            if (max + list.get(i) <= 0) {
                now = 0;
            } else {
                now = now + list.get(i);
            }
        }
        return max;
    }

}
