package com.acxie.leetcode.公司算法题.网易.俄罗斯方块;

import java.util.*;

/**
 * @description:
 * @create: 2020/02/08 17:40
 */
public class 俄罗斯方块 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count = sc.nextInt();
        List<Integer> list = new ArrayList<>(Collections.nCopies(size, 0));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            list.set(num - 1, list.get(num - 1) + 1);
        }

        int result = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < result) {
                result = list.get(i);
            }
        }
        System.out.println(result);


    }
}
