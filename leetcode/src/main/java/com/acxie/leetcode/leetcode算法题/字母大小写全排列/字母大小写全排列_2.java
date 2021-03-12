package com.acxie.leetcode.leetcode算法题.字母大小写全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:回溯
 * @create: 2020/02/02 17:01
 */
public class 字母大小写全排列_2 {

    //TODO 改变大小：str[index]+=dis
    List<String> list = new ArrayList<>();


    public List<String> letterCasePermutation(String S) {
        //int dis = 'A'-'a';
        //System.out.println(dis);
        S = S.toLowerCase();

        letterCasePermutation(S.toCharArray(), 0);  //sb= new StringBuilder(S.toLowerCase());


        return list;

    }

    public void letterCasePermutation(char[] s, int index) {

        if (index == s.length) {
            //    System.out.println(s.toString());
            //TODO char的 tostring 不同于 new string
            //  System.out.println(new String(s));
            list.add(new String(s));
            return;
        }
        if (s[index] >= 'a' && s[index] <= 'z') {

            letterCasePermutation(s, index + 1);
            s[index] -= 32;
            letterCasePermutation(s, index + 1);
            //TODO
            s[index] += 32;
        } else {
            letterCasePermutation(s, index + 1);
        }

    }


    public static void main(String[] args) {
        字母大小写全排列_2 test = new 字母大小写全排列_2();
        test.letterCasePermutation("1234");
        System.out.println(test.list);


    }
}
