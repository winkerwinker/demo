package com.acxie.leetcode.公司算法题.网易.迷路的牛牛;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/08 00:04
 */
public class 迷路的牛牛 {
    // TODO: 2020-02-08
    public static void solution(StringBuilder sb) {
        //去重
        int now = 1;
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'N');
        map.put(2, 'S');
        map.put(3, 'E');
        map.put(4, 'W');

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'L') {
                if (now == 1) {
                    now = 4;
                } else if (now == 2) {
                    now = 3;
                } else if (now == 3) {
                    now = 1;
                } else {
                    now = 2;
                }
            } else {
                if (now == 1) {
                    now = 3;
                } else if (now == 2) {
                    now = 4;
                } else if (now == 3) {
                    now = 2;
                } else {
                    now = 1;
                }
            }
        }

        System.out.println(map.get(now));

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        StringBuilder sb = new StringBuilder(sc.next());
        solution(sb);
    }
}
