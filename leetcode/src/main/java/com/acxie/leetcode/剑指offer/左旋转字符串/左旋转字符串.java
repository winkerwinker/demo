package com.acxie.leetcode.剑指offer.左旋转字符串;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/3 12:52
 */

public class 左旋转字符串 {


    //字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

    public static String reverseLeftWords(String s, int n) {
        if (n == s.length()) {
            return s;
        }

        StringBuilder a = new StringBuilder(s.substring(0, n));
        String end = s.replace(a, "");
        String x = end + a;
        return x;

    }

    public static void main(String[] args) {

        String result = reverseLeftWords("", 0);
        System.out.println(result);

    }
}
