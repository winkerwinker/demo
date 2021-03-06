package com.acxie.leetcode.剑指offer.丑数;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/3 10:19
 */


public class 丑数_三指针 {
//    我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
//    输入: n = 10
//    输出: 12
//    解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。


    /**
     * @param n :
     * @Author : xieaichen
     * @Date : 2020/9/3 11:15
     * @Discription : 三指针
     */
    public static int nthUglyNumber(int n) {

        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        List<Integer> ugly = new ArrayList<>();
        list2.add(1);
        list3.add(1);
        list5.add(1);

        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        int i = 1;
        while (i <= n) {
            //三个数的最小值如此计算
            int temp = Math.min(list2.get(p2) * 2, Math.min(list3.get(p3) * 3, list5.get(p5) * 5));
            if (temp == list2.get(p2) * 2) {
                p2++;
                list2.add(temp);
            }
            if (temp == list3.get(p3) * 3) {
                p3++;
                list3.add(temp);
            }
            if (temp == list5.get(p5) * 5) {
                p5++;
                list5.add(temp);
            }
            ugly.add(temp);
            System.out.println(ugly);
            System.out.println(list2);
            System.out.println(list3);
            System.out.println(list5);
            i++;
        }

        return ugly.get(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(
                nthUglyNumber(10 )
        );

    }

}
