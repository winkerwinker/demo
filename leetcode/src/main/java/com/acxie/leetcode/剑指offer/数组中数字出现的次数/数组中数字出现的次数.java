package com.acxie.leetcode.剑指offer.数组中数字出现的次数;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/13 15:22
 */

//里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
public class 数组中数字出现的次数 {


    public static int[] singleNumbers(int[] nums) {
        String all = Integer.toBinaryString(Arrays.stream(nums).reduce(0, (acc, item) -> acc ^ item));

        int bit = -1;
        for (int i = all.length() - 1; i >= 0; i--) {
            if (all.charAt(i) - '1' == 0) {
                //和最右边距离多少位
                bit = all.length() - i;
                break;
            }
        }


        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
//1 说明有不同 ，0 说明此位子相同
        for (int i : nums
        ) {
            char c = '0';
            String s = Integer.toBinaryString(bit ^ i);
            if (!(s.length() - bit >= s.length() || s.length() - bit < 0)) {
                c = s.charAt(s.length() - bit);
            }
            if (c == '1') {
                list.add(i);
            } else {
                list1.add(i);
            }
        }


        Integer reduce = list.stream().reduce(0, (acc, item) -> acc ^ item);
        Integer reduce1 = list1.stream().reduce(0, (acc, item) -> acc ^ item);
        return new int[]{reduce, reduce1};
    }

    public static void main(String[] args) {
        int[] ints = singleNumbers(new int[]{4, 1, 4, 6});
        System.out.println(Arrays.toString(ints));
    }
}
