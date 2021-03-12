package com.acxie.leetcode.公司算法题.深信服.集合遍历;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 集合遍历 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[] nums = new int[k];
            for (int i = 0; i < k; i++) {
                nums[i] = sc.nextInt();
            }

            List<String> result = new LinkedList<>();
            help(result, n, 0, nums, "");
            result.forEach(System.out::println);
        }
    }

    protected static void help(List<String> result, int target, int start, int[] nums, String s) {
        if (target == 0 && start == nums.length) {
            result.add(s);
            return;
        }

        if (start == nums.length) {
            return;
        }
        for (int i = 0; i <= Math.min(target, nums[start]); i++) {
            // 取当前 target 和对应球的数量中的较小值。
            help(result, target - i, start + 1, nums, s + i);
        }
    }
}