package com.acxie.leetcode.公司考试题.深信服.考试答案;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/20 18:59
 */
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int count = sc.nextInt();
        List<String> str = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            String temp = sc.next();
            str.add(temp.substring(2, temp.length() - 1));

        }
        System.out.println(str);


        help(time, str);
    }

    private static void help(int time, List<String> str) {

        for (int i = 0; i < str.size(); i++) {
            toAns(time, str.get(i));
        }
    }

    private static void toAns(int time, String str) {
        str = str.replaceAll("lg[(]n[)]", Math.log(Double.valueOf(time)) / Math.log(2) + "");
        str = str.replaceAll("sqrt[(]n[)]", Math.sqrt(Double.valueOf(time)) / Math.log(2) + "");
        str = str.replaceAll("n", time + "");
        str = str.replaceAll("lg[(]|sqrt[(]|[)]", "");
        System.out.println(str);
        String[] a = str.split(",");
//        int result=
        for (int i = 0; i < a.length; i++) {

        }

    }
}
