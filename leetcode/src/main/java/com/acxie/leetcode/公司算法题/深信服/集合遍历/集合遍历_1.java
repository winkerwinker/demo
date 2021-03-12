package com.acxie.leetcode.公司算法题.深信服.集合遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 集合遍历_1 {
    static List<Integer> list;
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        list = new ArrayList();
        result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int k = sc.nextInt();
            int n = sc.nextInt();//需要n个

            for (int i = 0; i < k; i++) {
                list.add(sc.nextInt());
            }


            help(n, 0, "");

            result.forEach(System.out::println);
        }
    }

    private static void help(int target, int i, String now) {//当前是第i层
        if (target == 0 && i == list.size()) {
            result.add(now);
            return;
        }
        if (i == list.size()) {
            return;
        }
        for (int j = 0; j < Math.min(target + 1, list.get(i) + 1); j++) {
            help(target - j, i + 1, now + j);
        }


    }
}