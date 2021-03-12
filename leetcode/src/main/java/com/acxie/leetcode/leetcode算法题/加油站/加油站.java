package com.acxie.leetcode.leetcode算法题.加油站;

import java.util.Arrays;

/**
 * @description:
 * @create: 2020/02/26 01:20
 */
public class 加油站 {

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length - 1; i++) {
            cost[i] = gas[i + 1] - cost[i];
        }
        cost[cost.length - 1] = gas[0] - cost[cost.length - 1];
        System.out.println(Arrays.toString(cost));

        //从最大子序列的开头
        int max = 0;
        int maxindex = 0;
        int nowindex = -1;
        int now = 0;
        for (int i = 0; i < cost.length; i++) {

            if (now + cost[i] > max && nowindex != maxindex) {
                maxindex = nowindex;
            }
            max = Math.max(now + cost[i], max);
            if (now + cost[i] > 0) {
                now += cost[i];
            } else {
                nowindex = i + 1;
                now = 0;
            }
        }

        System.out.println(maxindex);


        int count = cost.length;
//        while (count <)

            return 1;

    }
}


//    int a=hash.values().stream().max(new Comparator<Integer>() {
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return o1-o2;
//        }
//    }).get();