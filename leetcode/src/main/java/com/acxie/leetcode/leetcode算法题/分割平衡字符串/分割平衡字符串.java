package com.acxie.leetcode.leetcode算法题.分割平衡字符串;

public class 分割平衡字符串 {
    public static int balancedStringSplit(String s) {
        int rcount=0;
        int lcount=0;
        int total=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='R'){
                rcount++;
            }
            if (s.charAt(i)=='L'){
                lcount++;
            }
            if (lcount!=0&&lcount==rcount){
                rcount=0;
                lcount=0;
                total++;
            }


        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(分割平衡字符串.balancedStringSplit("RLLLLRRRLR"));
    }
}
