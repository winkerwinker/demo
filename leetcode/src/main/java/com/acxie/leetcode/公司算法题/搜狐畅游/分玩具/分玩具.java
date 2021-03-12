package com.acxie.leetcode.公司算法题.搜狐畅游.分玩具;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/25 20:42
 */
public class 分玩具 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        List<Integer> list = Arrays.asList(sc.nextLine().split(" ")).stream().map(A -> Integer.valueOf(A)).sorted().collect(Collectors.toList());
        int amount = list.stream().reduce(0, (acc, item) -> acc + item);
        if (amount % list.size() != 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(solution(list, amount / list.size()));
    }

    private static int solution(List<Integer> list, int target) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) - target) % 2 == 1) return -1;
            else count += Math.abs((list.get(i) - target) / 2);
        }

        return count/2;
    }


}
