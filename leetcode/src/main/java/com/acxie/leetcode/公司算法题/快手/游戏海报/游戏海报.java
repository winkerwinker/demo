package com.acxie.leetcode.公司算法题.快手.游戏海报;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/23 17:25
 */
public class 游戏海报 {


    private static int solution(String next) {
        int[] counts = new int[26];
        int temp = (next.length() + 1) * 26;
        //寻找连续的串
        int count = 0;
        for (int i = 1; i < next.length(); i++) {
            if (next.charAt(i) == next.charAt(i - 1)) count++;
            else {
                if (count != 0) {
                    counts[next.charAt(i - 1) - 'a'] += (count + 1);
                }
                count = 0;
            }
        }
        if (count + 1 == next.length()) {
            System.out.println("---这种情况");
            temp--;
        }
        if (count != 0) {
            counts[next.charAt(next.length() - 1) - 'a'] += (count + 1);
        }
        System.out.println(Arrays.toString(counts));
        // 26个字母
        int div = 0;
        for (int i = 0; i < counts.length; i++) {
            div += counts[i];
        }


        return temp - div;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution("hi"));
    }


}
