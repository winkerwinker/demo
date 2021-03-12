package com.acxie.leetcode.公司算法题.有赞.字符串旋转;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/25 01:54
 */
public class 字符串旋转 {
    //todo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        solution(a.split(";")[0], a.split(";")[1]);
    }

    //todo 注意s==s1的时候
    private static void solution(String s, String s1) {
        if (s.equals(s1)) {
            System.out.println(true);
            return;
        }
        if (s.length() != s1.length()) {
            System.out.println(false);
            return;
        }
        int index = s.indexOf(s1.charAt(0));
        while (index != -1) {

            if ((s1.substring(0, s.length() - index).equals(s.substring(index))) && (s1.substring(s.length() - index).equals(s.substring(0, index)))) {
                System.out.println(true);
                return;
            }
            if (s.substring(index + 1).indexOf(s1.charAt(0)) == -1) {
                System.out.println(false);
                System.exit(0);
            }
            index = s.substring(index + 1).indexOf(s1.charAt(0)) + index + 1;
        }
        System.out.println(false);
    }
}


//        System.out.println(s1.substring(0, s.length() - index ));
//        System.out.println(s.substring(index));
//        System.out.println(s1.substring(s.length() - index ));
//        System.out.println(s.substring(0, index));