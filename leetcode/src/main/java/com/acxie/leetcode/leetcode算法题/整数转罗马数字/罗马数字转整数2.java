package com.acxie.leetcode.leetcode算法题.整数转罗马数字;

import java.util.HashMap;

public class 罗马数字转整数2 {
    static int num;
    static HashMap<Integer, Character> kv = new HashMap<Integer, Character>();

    static {

        kv.put(1, 'I');
        kv.put(5, 'V');
        kv.put(10, 'X');
        kv.put(50, 'L');
        kv.put(100, 'C');
        kv.put(500, 'D');
        kv.put(1000, 'M');
    }

    public static int romanToInt(String s) {

        StringBuilder sb = new StringBuilder();
        //String sb1=s.split("I|V")[0];
        String sb3 = s.split("C|D")[1];
        System.out.println(sb3);
        return 0;
    }

    public static void main(String[] args) {
        romanToInt("CMXCIV");
    }
}
