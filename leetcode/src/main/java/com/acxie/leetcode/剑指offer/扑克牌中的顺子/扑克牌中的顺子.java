package com.acxie.leetcode.剑指offer.扑克牌中的顺子;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/4 12:01
 */


//        Collections.addAll(list, nums);
//        用Integer就不会报错
public class 扑克牌中的顺子 {

    public static boolean isStraight(int[] nums) {

//        Arrays.stream( src ) 和  Stream.of(nums) 是不同的
        List<Integer> list = Arrays.stream(nums).filter(a -> a != 0).sorted().boxed().collect(Collectors.toList());
        int zerocount = nums.length - list.size();
        int temp = 0;

        //计算总数和最小的数字
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1)) return false;
            temp = temp + (list.get(i) - list.get(i - 1) - 1);
        }
        System.out.println(zerocount);
        System.out.println(temp);
        return temp <= zerocount;
    }

    public static void main(String[] args) {
        boolean straight = isStraight(new int[]{0, 0, 2, 2, 5});
        System.out.println(straight);
    }
}



























