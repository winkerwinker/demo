package com.acxie.leetcode.公司考试题.深信服.考试答案;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/20 18:59
 */
public class Main_2 {

    static int count = 0;

    public static void main(String[] args) {
        count = 0;
        Scanner sc = new Scanner(System.in);
        String test = sc.next();

        List<String> list = new ArrayList<>();
        list = Arrays.asList(test.split(","));
//        System.out.println(list);


        System.out.println(help(list));
    }

    private static boolean help(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (!temp.contains("-")) {
                if (Integer.valueOf(temp) >= 65535 || Integer.valueOf(temp) <= 1) {
                    return false;
                }
                count++;
            } else {
                String[] x = temp.split("-");
                if (x.length != 2) {
                    return false;
                }
                int start = Integer.valueOf(x[0]);
                int end = Integer.valueOf(x[1]);
                if (start>=end) return false;
                if ((start >= 65535 || start <= 1) || (end >= 65535 && end <= 1)) {
                    return false;
                }
                count+=end-start+1;
            }

        }
        if (count>1024){
             return false;
        }
        return true;
    }


}
