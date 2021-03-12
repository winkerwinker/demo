package com.acxie.leetcode.公司算法题.橙心优选.回文子串;

/**
 * @description: 中心扩展
 * <p>
 * 如何处理 a -》 aa -》 aaa
 * @create: 2021/01/25 00:00
 */
public class 回文子串 {

    public static int countSubstrings(String s) {
        int count = s.length();
        for (int i = 0; i < s.length(); i++) {
            //中心扩展
            int from = i;
            int to = i;
            //todo 由于无法解决两个核心带来的问题
            while (from >= 0 && to < s.length()) {
                from++;
                to++;
                count++;

            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int abc = countSubstrings("abc");
        System.out.println(abc);

    }
}
