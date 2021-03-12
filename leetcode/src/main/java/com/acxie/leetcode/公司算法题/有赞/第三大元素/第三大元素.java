package com.acxie.leetcode.公司算法题.有赞.第三大元素;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/25 03:25
 */
public class 第三大元素 {

    public static void main(String[] args) {
        String a = new Scanner(System.in).nextLine();
        System.out.println(solution(Arrays.asList(a.substring(1, a.length() - 1).split(",")).stream().map(A -> Integer.valueOf(A)).collect(Collectors.toList())));
    }

    private static int solution(List<Integer> list) {
        //使用选择排序或者冒泡排序

        for (int i = list.size() - 1; i >= list.size() - 3; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println(list);
        return list.get(list.size() - 3);
    }
}
