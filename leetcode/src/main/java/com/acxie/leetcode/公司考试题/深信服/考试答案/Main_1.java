package com.acxie.leetcode.公司考试题.深信服.考试答案;


import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/20 18:59
 */
public class Main_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  test = sc.nextLine();
        String  index = sc.next();

//        System.out.println(test);
//        System.out.println(index);
        help(test, index);
    }

    private static void help(String test, String index) {
      String result=  test.replaceAll(index,"");
        System.out.println(result);
    }


}
