package com.acxie.leetcode.leetcode算法题.至少有K个重复字符的最长子串;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/22 21:02
 */
public class 至少有K个重复字符的最长子串_2 {

    public static int longestSubstring(String s, int k) {
        List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int l = 0; l < list.size(); l++) {
            if (map.containsKey(list.get(l))) {
                map.replace(list.get(l), map.get(list.get(l)) + 1);
            } else {
                map.put(list.get(l), 1);
            }
        }
        List<Character> set = map.keySet().stream().filter(a -> map.get(a) < k).collect(Collectors.toList());
        System.out.println(set);
        for (int i = 0; i < set.size(); i++) {
            String[] strs = s.split(set.get(i) + "");
            String result = "";
            System.out.println(Arrays.toString(strs));
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() >= result.length()) {
                    result = strs[j];
                }
            }
            s = result;
        }
        System.out.println("--------------");
        return s.length();
    }

    public static void main(String[] args) {

        System.out.println(longestSubstring("ababacb", 3));
    }
}

