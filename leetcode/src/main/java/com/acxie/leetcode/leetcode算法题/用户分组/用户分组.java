package com.acxie.leetcode.leetcode算法题.用户分组;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @description:hash map
 * @create: 2020/02/03 15:03
 */
public class 用户分组 {


    static List<List<Integer>> list = new ArrayList<List<Integer>>();

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {

        HashMap<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (hashMap.containsKey(groupSizes[i])) {
                if (hashMap.get(groupSizes[i]).size() == groupSizes[i]) {
                    list.add(hashMap.get(groupSizes[i]));
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    hashMap.replace(groupSizes[i], temp);
                } else {
                    hashMap.get(groupSizes[i]).add(i);
                    hashMap.replace(groupSizes[i], (hashMap.get(groupSizes[i])));
                }
            } else {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                hashMap.put(groupSizes[i], temp);
            }
        }


        //把所有hash 放进list 遍历hashmap
        for (HashMap.Entry<Integer, List<Integer>> entery : hashMap.entrySet()) {
            list.add(entery.getValue());
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3}));
    }
}
