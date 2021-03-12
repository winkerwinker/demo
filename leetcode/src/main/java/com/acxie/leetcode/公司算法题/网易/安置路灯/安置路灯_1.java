package com.acxie.leetcode.公司算法题.网易.安置路灯;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @description: WORNG
 * @create: 2020/02/07 19:58
 */
public class 安置路灯_1 {

    // TODO: 2020-02-08  好好了解一下到底是怎么做的
    static List<Integer> result = new ArrayList<>();

    public static void solution(List<Character> list) {
//        System.out.println(list);

        //todo 使用正则分割的学习
        int need = 0;
        int count3 = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == '.') {
                count3++;
            } else if (list.get(i) == 'X') {
                if (count3 == 1 && i + 1 < list.size() && i - 1 >= 0 && (list.get(i + 1) == '.') && (list.get(i - 1) == '.')) {
                    need++;
                    i++;
                } else if (count3 >= 1) {
                    need++;
                }
                count3 = 0;
            }
            if (count3 == 3) {
                need++;
                count3 = 0;
            }
        }
        if (count3 > 0) {
            need++;
        }
        System.out.println(need);
        result.add(need);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < times; i++) {
            int count = sc.nextInt();
            // todo myString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            // Guava     LinkedList<Character> characterList = Lists.newLinkedList(Chars.asList(string.toCharArray()));
            String a = sc.next();
//            System.out.println(a);
            // todo next() 和 nextline() 的区别
//            System.out.println(a);
            list = a.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

            solution(list);
        }


    }
}
