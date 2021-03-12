package com.acxie.leetcode.公司算法题.京东.配比;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/25 21:19
 */
//保留4位小数
public class 配比 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int V = Integer.valueOf(sc.nextLine().trim());
        List<Double> list2 = new ArrayList<Double>();
        List<Integer> list = Arrays.asList(sc.nextLine().split(",")).stream().map(A -> Integer.valueOf(A.trim())).collect(Collectors.toList());
        List<Integer> list1 = Arrays.asList(sc.nextLine().split(",")).stream().map(A -> Integer.valueOf(A.trim())).collect(Collectors.toList());
        int total = 0;
        for (int i = 0; i < list1.size(); i++) {
            list2.add((double) list1.get(i) / list.get(i));
            total += list.get(i);
        }
//        System.out.println(list2);
        Double max = list2.stream().min(Comparator.naturalOrder()).get();
//        System.out.println(max);
//        System.out.println(total);
        System.out.println(String.format("%.4f", (Math.min(max * total, V))));
    }
}
