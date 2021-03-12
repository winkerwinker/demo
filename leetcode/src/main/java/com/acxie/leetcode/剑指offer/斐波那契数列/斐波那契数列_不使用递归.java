package com.acxie.leetcode.剑指offer.斐波那契数列;

/**
 * @description:
 * @create: 2020/10/07 21:23
 */


//268435456-----536870912
//536870912-----1073741824
//1073741824------2147483648
//-2147483648-----0
public class 斐波那契数列_不使用递归 {

    public static int fib(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;

        int i = 0;
        int j = 1;
        for (int k = 2; k < n + 1; k++) {
            int temp = j % ((int) 1e9 + 7);
            j = (j + i) % ((int) 1e9 + 7);
            i = temp;

            System.out.println(i + "--->" + j);
        }
        return j;

    }

    public static void main(String[] args) {
        System.out.println(fib(44));
    }
}
