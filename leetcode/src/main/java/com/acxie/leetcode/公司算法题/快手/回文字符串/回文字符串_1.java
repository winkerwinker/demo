package com.acxie.leetcode.公司算法题.快手.回文字符串;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:连续
 * @create: 2020/02/22 15:25
 */
public class 回文字符串_1 {

    public static String max_reverse(String s) {
        //开头与结尾不必遍历
        if (s.length() < 1) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return s;
            }
            return s.charAt(0) + "";
        }
//        List<Character> list = new ArrayList<Character>(Chars.asList(string.toCharArray()));
        List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < list.size() - 1; i++) {
            //从中心扩张所有相同的
            StringBuilder sb = new StringBuilder();
            int left = i - 1;
            int right = i + 1;
            sb.append(list.get(i));
            while (left >= 0 && list.get(left) == list.get(i)) {
                left--;
                sb.append(list.get(i));
            }
            while (right < list.size() && list.get(right) == list.get(i)) {
                right++;
                sb.append(list.get(i));
            }
            while (left >= 0 && right < list.size() && list.get(left) == list.get(right)) {
                sb.append(list.get(right));
                sb.insert(0, list.get(right));
                left--;
                right++;
            }
            if (sb.length() > result.length()) {
                result = sb;
            }
        }

        return result + "";
    }

    public static void main(String[] args) {
        System.out.println(max_reverse("abcdbbfcba"));
    }


}
