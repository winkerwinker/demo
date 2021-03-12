package com.acxie.leetcode.公司算法题.深信服.子串模糊匹配;


import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/20 13:19
 */

//从字符串string开始完整匹配子串sub，返回匹配到的字符个数。
//
//sub中如果出现'?'表示可以匹配一到三个除'\0'以外的任意字符。
//如果sub还有找不到匹配的字符，则说明不能完整匹配。
//
//如果能完整匹配，返回匹配到的字符个数，如果有多种匹配方式，返回匹配字符数最少的那个，如果不能完整匹配，返回-1

//abcdefg
//a?c
public class 子串模糊匹配 {

    public static int test(String a, String b) {

        int rightlen = 0;
        int ext = 0;
        for (int i = 0; i < a.length() && rightlen < b.length(); i++) {
            if (b.charAt(rightlen) == a.charAt(i)) {
                rightlen++;
            } else if (b.charAt(rightlen) == '?') {
                if (rightlen == a.length() - 1) {
                    if (a.length() - 1 - i <= 2) {
                        return rightlen + ext + a.length() - i;
                    } else return -1;
                }
                int tail = Math.min(a.length() - 1, i + 3);
                if (a.substring(i + 1, tail + 1).contains(b.charAt(rightlen + 1) + "")) {
                    ext += a.indexOf(b.charAt(rightlen + 1)) - i - 1;
                    System.out.println(ext);
                    i = a.indexOf(b.charAt(rightlen + 1));
                    rightlen += 2;
                } else {
                    return -1;
                }

            }
        }
        if (rightlen >= b.length() - 1) return b.length() + ext;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();


        System.out.println(a);
        System.out.println(b);
        System.out.println(test(a, b));

    }


}
