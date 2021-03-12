package com.acxie.leetcode.leetcode算法题.数组大小减半;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/26 01:04
 */
public class 数组大小减半 {

    public static void main(String[] args) {
        System.out.println(minSetSize(new int[]{9}));
    }


    public static int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int a : arr) {
            if (map.containsKey(a)) {
                map.replace(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        List<Integer> q = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).map(a -> a.getValue()).collect(Collectors.toList());
//        System.out.println(q);
        int count = 0;
        int rest = (arr.length + 1) / 2;
//        System.out.println(rest);
        for (int a : q) {
            rest -= a;
            count++;
            if (rest <= 0) {
                return count;
            }
        }
        return -1;
    }
}
