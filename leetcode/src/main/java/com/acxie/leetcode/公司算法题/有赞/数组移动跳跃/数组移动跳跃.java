package com.acxie.leetcode.公司算法题.有赞.数组移动跳跃;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/25 02:57
 */
public class 数组移动跳跃 {

    public static void main(String[] args) {
        String a = new Scanner(System.in).nextLine();
        System.out.println(solution(Arrays.asList(a.substring(1, a.length() - 1).split(",")).stream().map(A -> Integer.valueOf(A)).collect(Collectors.toList())));
    }

    private static boolean solution(List<Integer> list) {
        // 如果走过设置为0，被认为困在这里
        int index = 0;
        while (index < list.size() && index >= 0) {
            if (list.get(index) == 0) return false;
            int temp = list.get(index) + index;
            list.set(index, 0);
            index = temp;
        }
        return true;
    }
}
