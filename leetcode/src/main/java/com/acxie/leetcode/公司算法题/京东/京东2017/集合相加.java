package com.acxie.leetcode.公司算法题.京东.京东2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/07 16:43
 */
public class 集合相加 {


    public static List<Integer> solution(List<Integer> list, List<Integer> list1) {

        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i));
        }
        //list . toarray
        // TODO: 2020-02-07  
        Integer[] a = list.toArray(new Integer[0]);
        Arrays.sort(a);
        List<Integer> list2 = Arrays.asList(a);

        return list2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = sc.nextInt();
        int count2 = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < count1; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < count2; i++) {
            list1.add(sc.nextInt());
        }
        List<Integer> a = solution(list, list1);

        for (int i = 0; i < a.size(); i++) {
            if (i == a.size() - 1) {
                System.out.print(a.get(i));
            } else {
                System.out.print(a.get(i) + " ");
            }
        }

    }
}
