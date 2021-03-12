package com.acxie.leetcode.leetcode算法题.反转字符串中的单词III;

public class 反转字符串中的单词III {

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        String[] list = s.split(" ");
        for (int i = 0; i < list.length; i++) {

            String str = list[i];
            for (int j = str.length() - 1; j >= 0; j--) {
                System.out.println(str.charAt(j));
                sb.append(str.charAt(j));
            }

            if (i != list.length - 1) {
                System.out.println(" ");
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));

    }
}
