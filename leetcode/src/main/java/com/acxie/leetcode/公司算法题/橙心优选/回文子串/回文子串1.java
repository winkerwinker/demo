package com.acxie.leetcode.公司算法题.橙心优选.回文子串;

/**
 * @description: 中心扩展
 * <p>
 * 如何处理 a -》 aa -》 aaa
 * @create: 2021/01/25 00:00
 */
public class 回文子串1 {

    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= i + 1; j++) {
                // j =1那么核心是两个
                int from = i;
                int to = j;
                while (from >= 0 && to < s.length() && s.charAt(from--) == s.charAt(to++)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int abc = countSubstrings("aaa");

        System.out.println(abc);

    }
}
