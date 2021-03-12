package com.acxie.leetcode.公司算法题.快手.合并数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/23 18:07
 */
public class 合并数组 {


    public static String solution(List<Integer> list, List<Integer> list1) {
        List<Integer> list2 = new ArrayList<>();
        int flag = 0;
        int flag1 = 0;
        while (flag < list.size() && flag1 < list1.size()) {
            if (list1.get(flag1) >= list.get(flag)) {
                list2.add(list.get(flag++));
            } else {
                list2.add(list1.get(flag1++));
            }
        }
        for (int i = flag; i < list.size(); i++) {
            list2.add(list.get(i));
        }
        for (int i = flag1; i < list1.size(); i++) {
            list2.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            if (i != list2.size() - 1) {
                System.out.print(list2.get(i) + ",");
            } else {
                System.out.print(list2.get(i));
            }
        }

        return "";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //todo map和mapint
        String a = sc.next();
        if (!sc.hasNext()) {
            System.out.println(a);
            return;
        }
        String b = sc.next();
        List<Integer> list = Arrays.asList(a.split(",")).stream().map(e -> Integer.valueOf(e)).collect(Collectors.toList());
//        list.add(0, 0);
        List<Integer> list1 = Arrays.asList(b.split(",")).stream().map(e -> Integer.valueOf(e)).collect(Collectors.toList());
//        List<Integer> list2;
//        System.out.println(list);
//        System.out.println(list1);
//        if (list.get(0) > list1.get(0)) {
//            list2 = list;
//            list = list1;
//            list1 = list2;
//        }
        solution(list, list1);
    }

}
