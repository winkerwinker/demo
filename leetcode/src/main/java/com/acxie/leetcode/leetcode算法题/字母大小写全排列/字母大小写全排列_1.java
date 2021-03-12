package com.acxie.leetcode.leetcode算法题.字母大小写全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @create: 2020/02/02 17:01
 */
public class 字母大小写全排列_1 {

    //TODO 有坑，答案不通过
     List<String> list = new ArrayList<>();

    public  List<String> letterCasePermutation(String S) {
        boolean has = false;
        StringBuilder sb= new StringBuilder(S.toLowerCase());
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c >= 'a' && c <= 'z') {
                has = true;
                letterCasePermutation(sb, i);  //sb= new StringBuilder(S.toLowerCase());
                sb.replace(i, i + 1, String.valueOf(Character.toUpperCase(c)));
                letterCasePermutation(sb, i);
                break;
            }
        }
        if (!has){
            list.add(S);
            return list;
        }
        return list;

    }

    public  void letterCasePermutation(StringBuilder sb, int index) {

        StringBuilder used=new StringBuilder(sb.toString());
        boolean has = false;

        for (int i = index + 1; i < used.length(); i++) {
            char c = used.charAt(i);
            if (c >= 'a' && c <= 'z') {
                has = true;
                letterCasePermutation(used, i);
                used.replace(i, i + 1, String.valueOf(Character.toUpperCase(c)));
                letterCasePermutation(used, i);
                break;
            }
        }
        if (!has) {
            list.add(used.toString());
        }


    }


    public static void main(String[] args) {
        字母大小写全排列_1 test= new 字母大小写全排列_1();
        test.letterCasePermutation("c");
        System.out.println(test.list);
    }
}
