package com.acxie.leetcode.公司算法题.有赞.众数;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/25 03:16
 */
public class 众数 {

    public static void main(String[] args) {
        String a = new Scanner(System.in).nextLine();
        System.out.println(solution(Arrays.asList(a.substring(1, a.length() - 1).split(",")).stream().map(A -> Integer.valueOf(A)).collect(Collectors.toList())));
    }

    private static int solution(List<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int a : list) {
            if (map.containsKey(a)) {
                map.replace(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).map(a -> a.getKey()).collect(Collectors.toList()).get(0);
    }

}
