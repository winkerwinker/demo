package com.acxie.leetcode.剑指offer.圆圈中最后剩下的数字;


import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/4 10:26
 */

public class 圆圈中最后剩下的数字1 {


    public static int lastRemaining(int n, int m) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return lastRemaining1(list, m, 0);
    }

    //使用指针，而不是使用addall
    public static int lastRemaining1(List<Integer> list, int m, int index) {
        if (list.size() == 1) return list.get(0);

        int nowindex = ((m + index - 1) % list.size());
//        System.out.println(nowindex);
        list.remove(nowindex);
        if (nowindex == list.size()) nowindex = 0;
        return lastRemaining1(list, m, nowindex);
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(10, 17));

    }
}
