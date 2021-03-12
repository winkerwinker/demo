package com.acxie.leetcode.公司算法题.网易.安置路灯;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @description: WORNG
 * @create: 2020/02/07 19:58
 */
public class 安置路灯 {


    public static void solution(List<Character> list) {
//        System.out.println(list);
        List<Integer> result = new ArrayList<>();
        //todo 使用正则分割的学习
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == '.') {
                count++;
            } else if (list.get(i) == 'X' && count != 0) {
                result.add(count);
                count = 0;
            }
        }
        if (count != 0) {
            result.add(count);
        }

        int need = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) == 1) {
                need++;
            } else if (result.get(i) % 3 == 0) {
                need += result.get(i) / 3;
            } else {
                need += result.get(i) / 2;
            }
        }
        System.out.println(need);
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
            while (a.contains(".X.")) {
                a = a.replace(".X.", "...");
            }
            System.out.println(a);
            // todo next() 和 nextline() 的区别
//            System.out.println(a);
            list = a.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

            solution(list);
        }
    }
}
