package com.acxie.leetcode.leetcode算法题.字符串相加;

import org.junit.Assert;

import java.math.BigInteger;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/13 12:18
 */

public class 字符串相加 {

//num1 和num2 的长度都小于 5100
//num1 和num2 都只包含数字 0-9
//num1 和num2 都不包含任何前导零

    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int flag = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0) {
            Integer integer = i >= 0 ? Integer.valueOf(num1.charAt(i) + "") : 0;
            Integer integer2 = j >= 0 ? Integer.valueOf(num2.charAt(j) + "") : 0;
            i--;
            j--;
            int i1 = integer + integer2 + flag;
            flag = i1 / 10;
            stringBuilder.append(i1 % 10);
        }
        if (flag == 1) stringBuilder.append(flag);
        StringBuilder reverse = stringBuilder.reverse();

        return reverse.toString();
    }

    public static void main(String[] args) {
        String num1 = "888888888";
        String num2 = "888888888";

        String s = addStrings(num1, num2);
        BigInteger add = new BigInteger(num1).add(new BigInteger(num2));
        System.out.println(s);
        System.out.println(add);
        Assert.assertEquals(s, add.toString());

    }
}
