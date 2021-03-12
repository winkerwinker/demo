package com.acxie.leetcode.leetcode算法题.至少有K个重复字符的最长子串;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/22 21:02
 */
public class 至少有K个重复字符的最长子串_3 {

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
        final HashMap<Character, Integer> map1 = map;
        List<Character> set = map.keySet().stream().filter(a -> map1.get(a) < k).collect(Collectors.toList());
        if (set.isEmpty()) {
            return s.length();
        }
        if (set.size() == map.size()) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < set.size(); i++) {
            sb.append("|").append(set.get(i));
        }
        //todo if (sb.toString().equals("")){
        String[] strs = s.split(sb.substring(1));
        System.out.println(Arrays.toString(strs));

        int result = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() >= k && strs[i].length() >= result + k) {
                result = Math.max(result, longestSubstring(strs[i], k));
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("bbaaacbd", 3));
    }
}

