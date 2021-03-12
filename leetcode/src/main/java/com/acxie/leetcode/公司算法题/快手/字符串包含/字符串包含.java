package com.acxie.leetcode.公司算法题.快手.字符串包含;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/23 19:37
 */
public class 字符串包含 {


    private static int solution(String s, String s1) {
        if (s.contains(s1) || s1.contains(s)) {
            return 1;


        }
        return 0;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            System.out.println(solution(input.split(" ")[0], input.split(" ")[1]));
        }
    }


}
