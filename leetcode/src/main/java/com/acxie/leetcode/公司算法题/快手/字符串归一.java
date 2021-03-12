package com.acxie.leetcode.公司算法题.快手;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/22 14:38
 */
public class 字符串归一 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < input.length(); i++) {
            if (hashMap.keySet().contains(input.charAt(i))) {
                hashMap.replace(input.charAt(i), hashMap.get(input.charAt(i)) + 1);
            } else {
                hashMap.put(input.charAt(i), 1);
            }
            if (!list.contains(input.charAt(i))) {
                list.add(input.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();

        for (Character c : list) {
            sb.append(c).append(hashMap.get(c));
        }
        System.out.println(sb);
    }


}

