package com.acxie.leetcode.公司算法题.盒马;

/**
 * @description:
 * @create: 2020/12/01 02:42
 */
public class 左旋转字符串 {


    public static String reverseLeftWords(String s, int n) {
        if ("".equalsIgnoreCase(s) || s.length() == n || n == 0) {
            return s;
        }

        String sub = s.substring(0, n);
        String sub2 = s.substring(n, s.length());
//        System.out.println(sub);
//        System.out.println(sub2);


        return sub2
                + sub;
    }

    public static void main(String[] args) {

        String result = reverseLeftWords("lrloseumgh", 6);
        System.out.println(result);

    }
}
