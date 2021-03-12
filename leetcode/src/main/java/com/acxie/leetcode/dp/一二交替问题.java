package com.acxie.leetcode.dp;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/25 14:12
 */


//n个台阶有几种走法
public class 一二交替问题 {

    static List<Integer> list = new ArrayList<Integer>(Collections.nCopies(60, 0));

    public static int slove(int total) {
        if (total <= 0) {
            return 0;
        }
        if (total == 1) {
            return 1;
        }
        if (total == 2) {
            return 2;
        }

        if (list.get(total) != null && list.get(total) != 0) {
            return list.get(total);
        }

        int a = slove(total - 1) + slove(total - 2);
        list.set(total, a);
        System.out.print(Arrays.asList(list) + "\n");
        return a;
    }


    public static void main(String[] args) {
        int a = slove(8);
        System.out.print(a);
    }
}
