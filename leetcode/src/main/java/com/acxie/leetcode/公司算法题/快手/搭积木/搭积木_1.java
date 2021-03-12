package com.acxie.leetcode.公司算法题.快手.搭积木;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/24 20:32
 */
public class 搭积木_1 {

    //todo
    //求序列下最长连续子序列
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        List<String> list1 = new ArrayList<>();
        IdentityHashMap<Integer, Integer> hashMap = new IdentityHashMap<>();
        for (int i = 0; i < input; i++) {
            list1.add(sc.nextInt() + "," + sc.nextInt());
        }

        List<Integer> list = list1.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o1.split(",")[0]) - Integer.valueOf(o2.split(",")[0]);
            }
        }).map(a -> Integer.valueOf(a.split(",")[1])).collect(Collectors.toList());


//        System.out.println(list);
        System.out.println(solution(list));
    }

    private static int solution(List<Integer> list) {
        if (list.size() < 2) return list.size();
        int max = 1;
        int[] dp = new int[list.size()];
        dp[0] = 1;
        for (int i = 1; i < list.size(); i++) {
            int temp = 1;
            for (int j = 0; j < i; j++) {
                if (list.get(i) >= list.get(j)) {
                    temp = Math.max(temp, dp[j] + 1);
                }
            }
            dp[i] = temp;
            max = Math.max(temp, max);
        }
        return max;
    }
}


//Map result = map.entrySet().stream()
//	.sorted(Map.Entry.comparingByKey())
//	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//	(oldValue, newValue) -> oldValue, LinkedHashMap::new));
//        hashMap = hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));













































































