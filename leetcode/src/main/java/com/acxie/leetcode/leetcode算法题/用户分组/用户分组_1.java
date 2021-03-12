package com.acxie.leetcode.leetcode算法题.用户分组;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @description:hash map
 * @create: 2020/02/03 15:03
 */
public class 用户分组_1 {


    static List<List<Integer>> list = new ArrayList<List<Integer>>();

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {

        HashMap<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (hashMap.containsKey(groupSizes[i])) {
                hashMap.get(groupSizes[i]).add(i);
                hashMap.replace(groupSizes[i], (hashMap.get(groupSizes[i])));
            } else {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                hashMap.put(groupSizes[i], temp);
            }
        }


        //把所有hash 放进list 遍历hashmap
        for (HashMap.Entry<Integer, List<Integer>> entery : hashMap.entrySet()) {
            if (entery.getKey() == entery.getValue().size()) {
                list.add(entery.getValue());
            } else {
                int from = 0;
                int need = entery.getKey();
                for (int i = 0; i < entery.getValue().size() / entery.getKey(); i++) {
                    list.add(entery.getValue().subList(from, from + need));
                    from += need;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3}));
    }
}
