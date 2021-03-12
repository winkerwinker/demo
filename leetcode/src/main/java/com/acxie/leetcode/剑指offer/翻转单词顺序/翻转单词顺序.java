package com.acxie.leetcode.剑指offer.翻转单词顺序;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/10 14:28
 */

public class 翻转单词顺序 {


    public static String reverseWords(String s) {
//s.split(" ")解决不了单词间多空格的问题，s.split()可以解决。。。
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = s.trim().split("\\s+");
        for (int i = split.length - 1; i >= 0; i--) {
            stringBuilder.append(split[i]);
            if (i != 0) stringBuilder.append(" ");
        }
//        System.out.println(Arrays.toString(split));

        System.out.println(stringBuilder);

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        reverseWords("  hello world!  ");
    }
}
