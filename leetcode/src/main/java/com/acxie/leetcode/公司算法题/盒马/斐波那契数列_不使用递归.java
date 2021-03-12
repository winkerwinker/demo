package com.acxie.leetcode.公司算法题.盒马;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @create: 2020/10/07 21:23
 */


//268435456-----536870912
//536870912-----1073741824
//1073741824------2147483648
//-2147483648-----0
public class 斐波那契数列_不使用递归 {

    static List<Integer> list = new ArrayList<Integer>();

    static{
        list.add(0);
        list.add(1);
    }

    public static int fib(int n) {



        if (n < list.size()) return list.get(n);

        int i = (fib(n - 1) + fib(n - 2)) % 1000000007;

        list.add(i);

        return i;

    }

    public static void main(String[] args) {
        System.out.println(fib(44));
    }
}
