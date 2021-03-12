package com.acxie.leetcode.算法类型.排列组合.排列组合2;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:普通
 * @create: 2020/02/01 17:58
 */
public class 全排列_1 {

    //注意里面的泛型两边必须完全一致，因为另一边是不解析的，所有没有那种接口的写法
    static List<String> list = new LinkedList<String>();


    static char[] nums = new char[]{'1', '2', '3', '4'};
    static StringBuilder sb = new StringBuilder("");


    public static void backup(int i) {

        if (i == nums.length ) {
            list.add(new String(sb));
            return;
        }

        for (char a : nums) {
            if (sb.toString().contains(String.valueOf(a))) {
                continue;
            }
            sb.append(a);
            backup(i+1);
            //sub String 并没有改变原来的
            sb.deleteCharAt(sb.length()-1);
        }

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        backup(0);
        System.out.println(list);
    }
}
