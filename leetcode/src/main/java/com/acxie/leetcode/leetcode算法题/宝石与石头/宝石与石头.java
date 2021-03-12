package com.acxie.leetcode.leetcode算法题.宝石与石头;

/**
 * @description:
 * @create: 2020/02/03 21:04
 */
public class 宝石与石头 {


    public static int numJewelsInStones(String J, String S) {
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                if (S.charAt(i) == J.charAt(j)) {
                    count++;
                    break;
                }
            }
        }


        return count;
    }

    public static void main(String[] args) {
        System.out.println(  numJewelsInStones("aA","aAAbbbb"));

    }
}
