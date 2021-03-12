package com.acxie.leetcode.公司算法题.盒马;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @create: 2020/12/01 02:01
 */
public class 青蛙跳台阶问题 {


    static List<Integer> list = new ArrayList<Integer>();

    static {
        list.add(0);
        list.add(1);
        list.add(2);
    }

    public static int numWays(int n) {
        if (list.size() > n) {
            return list.get(n);
        }
        int i = (numWays(n - 2) + numWays(n - 1))% 1000000007;
        list.add(i);
        return i;

    }


    public static void main(String[] args) {
        int result = numWays(18);
        System.out.println(result);
    }

}
