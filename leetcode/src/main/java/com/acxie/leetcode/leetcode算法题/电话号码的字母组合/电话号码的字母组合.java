package com.acxie.leetcode.leetcode算法题.电话号码的字母组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/2 20:52
 */

//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
//给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

public class 电话号码的字母组合 {


    private static String[] letterMap = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private static List<String> result = new ArrayList<>();

    public static List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        List<String> list = new ArrayList();
        for (Character c :
                digits.toCharArray()) {
            String x = letterMap[Integer.valueOf(c + "")];
            list.add(x);
        }

        //全排列
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
        return result;
    }


    public static void add(String newone) {
        List<String> newrow = new ArrayList<>();
        if (result.isEmpty()) {
            result = Arrays.asList(newone.split(""));
            return;
        }
        for (int i = 0; i < result.size(); i++) {
            for (Character c : newone.toCharArray()) {
                newrow.add(result.get(i) + c);
            }

        }
        result = newrow;
//        System.out.println(result);

    }

    public static void main(String[] args) {

        letterCombinations("");
    }
}
