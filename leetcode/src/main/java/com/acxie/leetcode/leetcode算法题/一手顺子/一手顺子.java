package com.acxie.leetcode.leetcode算法题.一手顺子;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @create: 2020/02/04 16:41
 */
public class 一手顺子 {


    //TODO
    public static boolean isNStraightHand(int[] hand, int W) {
        Arrays.sort(hand);
        if (hand.length % W != 0) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        int index = 1;
        for (int i = 0; i < hand.length - 1; i++) {
            if (hand[i + 1] - hand[i] != 1) {
                list.add(index);
                index = 1;
            } else {
                index++;
            }
        }
        System.out.println(list);


        return false;
    }

    public static void main(String[] args) {
        isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3);

    }
}
