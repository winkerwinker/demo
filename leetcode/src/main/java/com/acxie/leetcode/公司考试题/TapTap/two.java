package com.acxie.leetcode.公司考试题.TapTap;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/02/28 19:38
 */
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.valueOf(sc.nextLine());
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> lists1 = new ArrayList<Integer>();
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        List<HashSet<Integer>> set = new ArrayList<HashSet<Integer>>();
        for (int i = 0; i < count; i++) {
            lists.add(Arrays.asList(sc.nextLine().split(" ")).stream().map(A -> Integer.valueOf(A)).collect(Collectors.toList()));
        }
//        System.out.println(lists);
        List<Integer> total = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            total.add(lists.get(i).stream().reduce(0, (acc, item) -> {
                        return acc + item;
                    }
            ).intValue());
        }

//        System.out.println(total);

        for (int i = 0; i < count; i++) {
            HashSet<Integer> sets = new HashSet<Integer>();
            for (int j = 0; j < lists.get(i).size(); j++) {
                sets.add(total.get(i)-lists.get(i).get(j));
            }
            sets.add(total.get(i));
            set.add(sets);
        }

        System.out.println(total);
        System.out.println(set);

        for (HashSet<Integer> hashSet : set) {
            lists1.addAll(hashSet);
        }
        for (int i = 0; i < lists1.size(); i++) {
            if (hash.containsKey(lists1.get(i))) {
                hash.replace(lists1.get(i), hash.get(lists1.get(i)) + 1);
            } else {
                hash.put(lists1.get(i), 1);
            }
        }

        int a = hash.values().stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }).get();
        System.out.println(a);
        for (HashMap.Entry en :
                hash.entrySet()) {
            System.out.println(en);
        }


    }


}
