package com.acxie.leetcode.leetcode算法题.连续字符;

/**
 * @description:
 * @create: 2020/10/07 18:55
 */
public class 连续字符 {

    public static int maxPower(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 1;
        int tempmax = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                tempmax++;
            } else {

                tempmax = 1;
            }
            max = Math.max(max, tempmax);
        }

        return max;
    }


    public static void main(String[] args) {
        int leetcode = maxPower("cc");
        System.out.println(leetcode);
    }


}
