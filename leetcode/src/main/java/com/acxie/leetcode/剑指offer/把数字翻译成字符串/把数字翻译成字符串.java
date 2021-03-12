package com.acxie.leetcode.剑指offer.把数字翻译成字符串;

import javax.swing.plaf.IconUIResource;
import java.util.Stack;

/**
 * @description:
 * @create: 2020/10/13 21:09
 */
public class 把数字翻译成字符串 {

    static int count;

    public static int translateNum(int num) {
        count = 0;
        translateNum1(num, (int) Math.pow(10, (num + "").length() - 1));
        return count;

    }

    public static void translateNum1(int num, int pow) {
        if (pow == 0) {
            count++;
            return;
        }
        System.out.println((char) (num / pow + 97));
        translateNum1(num % pow, pow / 10);

        if (pow >= 10 && num / (pow / 10) >= 10 && num / (pow / 10) <= 25) {
            System.out.println((char) (num / (pow / 10) + 97));
            translateNum1(num % (pow / 10), pow / 100);
        }
    }


    public static void main(String[] args) {
        System.out.println('a' - 0); // 97
        int i = translateNum(25);
        System.out.println(i);

    }
}
