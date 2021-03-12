package com.acxie.leetcode.公司考试题.游戏;

/**
 * @description:
 * @create: 2020/03/12 19:41
 */
public class Three {

    //计算出最大的头尾相等的长度
    public static String solution(String s) {
        int commonCount = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.substring(0, i));
            System.out.println(s.substring(s.length() - i, s.length()));
            if (s.substring(0, i).equals(s.substring(s.length() - i, s.length()))) {
                commonCount = i;
                System.out.println(commonCount);
                break;
            }
        }

        System.out.println(commonCount);
        return s + s.substring(commonCount, s.length());

    }

    public static void main(String[] args) {
        System.out.println(solution("abab"));
    }
}
