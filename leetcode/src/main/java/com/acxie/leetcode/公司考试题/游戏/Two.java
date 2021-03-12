package com.acxie.leetcode.公司考试题.游戏;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @create: 2020/03/12 19:41
 */
public class Two {

    //使用贪心算法
    public static int MaxScore(List<Integer> list) {

        int maxIndex = 0;
        //获得最大的下标
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(maxIndex)) {
                maxIndex = i;
            }
        }

        int total = list.get(maxIndex);
//        System.out.println(maxIndex);

        int left = maxIndex - 1;
        int right = maxIndex + 1;
        while (right <= list.size() - 1 || left >= 0) {
            if (right > list.size() - 1) {
                total = total * 2 + list.get(left--);
            } else if (left < 0) {
                total = total * 2 + list.get(right++);
            } else {
                if (list.get(left) >= list.get(right)) {
                    total = total * 2 + list.get(left--);
                } else {
                    total = total * 2 + list.get(right++);
                }
            }
        }


        return total - list.get(maxIndex);
    }

    public static void main(String[] args) {
        System.out.println(MaxScore(Arrays.asList(1, 2, 4, 3, 5)));
    }
}
