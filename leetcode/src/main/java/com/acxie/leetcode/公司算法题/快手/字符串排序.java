package com.acxie.leetcode.公司算法题.快手;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/22 14:47
 */
public class 字符串排序 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.valueOf(sc.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String a = sc.nextLine();
            list.add(Integer.valueOf(a.substring(a.length() - 6)));
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (Integer a :
                list) {
            System.out.println(a);
        }

    }
}
