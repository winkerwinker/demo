package com.acxie.leetcode.剑指offer.圆圈中最后剩下的数字;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/4 10:26
 */

public class 圆圈中最后剩下的数字 {


    public static int lastRemaining(int n, int m) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return lastRemaining1(list, m);
    }


    public static int lastRemaining1(List<Integer> list, int m) {
        if (list.size() == 1) return list.get(0);

        int index = (m - 1) % list.size();

        List<Integer> list1 = list.subList(0, index);
        //ConcurrentModificationException
        //不能在for i 中删除


        list = list.subList(index + 1, list.size());
        list.addAll(list1);
        return lastRemaining1(list, m);
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(0, 17));

    }
}
