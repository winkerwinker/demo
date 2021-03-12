package com.acxie.leetcode.公司算法题.网易.找工作;


import java.util.*;

/**
 * @description:每个人只能找一份工作
 * @create: 2020/02/07 17:06
 */
public class 找工作_1 {


    public static void solution(HashMap<Integer, Integer> map, List<Integer> ability) {
        List<Integer> result = new ArrayList<>(Collections.nCopies(ability.size(), 0));

        for (int i = 0; i < ability.size(); i++) {
            for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
                if (ability.get(i) >= entry.getValue()) {
                    if (entry.getKey() > result.get(i))
                        result.set(i, entry.getKey());
                }
            }

        }
//        System.out.println(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jobcount = sc.nextInt();
        int peoplecount = sc.nextInt();
//        List<Job> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ability = new ArrayList<>();
        for (int i = 0; i < jobcount; i++) {
            int ab = sc.nextInt();
            int sala = sc.nextInt();
            map.put(sala, ab);
        }
        for (int i = 0; i < peoplecount; i++) {
            ability.add(sc.nextInt());
        }
        solution(map, ability);

    }
}

