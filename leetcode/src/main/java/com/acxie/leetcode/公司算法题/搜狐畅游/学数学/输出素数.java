package com.acxie.leetcode.公司算法题.搜狐畅游.学数学;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @create: 2020/02/25 19:36
 */
public class 输出素数 {

    {
        System.out.println("代码块");

    }

    static {
        System.out.println("静态代码块");
    }

    //todo 不可以修改 https://blog.csdn.net/loveaborn/article/details/39754031
    static List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23));


    public static void main(String[] args) {
        int target = 1000;
        boolean flag = true;
        for (int i = 24; i <= target; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i % (list.get(j)) == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
            flag = true;
        }

        System.out.println(list);
    }
}
//todo 1不是质数
// 2· 3 · 5 · 7 · 11 · 13 · 17 · 19 · 23 · 29 · 31 · 37 · 41 · 43 · 47 · 53 · 59 · 61.