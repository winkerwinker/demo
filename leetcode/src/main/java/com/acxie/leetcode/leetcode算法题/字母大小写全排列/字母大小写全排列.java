package com.acxie.leetcode.leetcode算法题.字母大小写全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @create: 2020/02/02 17:01
 */
public class 字母大小写全排列 {

    static List<String> list = new ArrayList<>();

    public static List<String> letterCasePermutation(String S) {
        boolean has = false;
        S = S.toLowerCase();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c >= 'a' && c <= 'z') {
                has = true;
                StringBuilder sb = new StringBuilder(S);
                letterCasePermutation(S, i);
                sb.replace(i, i + 1, String.valueOf(Character.toUpperCase(c)));
                S = sb.toString();
                letterCasePermutation(S, i);
                break;
            }
        }
        if (!has) {
            list.add(S);
            return list;
        }
        return list;

    }

    public static void letterCasePermutation(String S, int index) {

        boolean has = false;

        for (int i = index + 1; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c >= 'a' && c <= 'z') {
                has = true;
                StringBuilder sb = new StringBuilder(S);
                letterCasePermutation(S, i);
                sb.replace(i, i + 1, String.valueOf(Character.toUpperCase(c)));
                S = sb.toString();
                letterCasePermutation(S, i);
                break;
            }
        }
        if (!has) {
            list.add(S);
        }


    }


    public static void main(String[] args) {

//        letterCasePermutation("ab23");
        letterCasePermutation("c");
        System.out.println(list);
    }
}
