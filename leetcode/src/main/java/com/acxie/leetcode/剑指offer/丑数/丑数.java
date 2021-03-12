package com.acxie.leetcode.剑指offer.丑数;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/3 10:19
 */

public class 丑数 {
//    我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
//    输入: n = 10
//    输出: 12
//    解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。

    // TODO: 2020/9/3 https://stackoverflow.com/questions/28851652/java-lang-classcastexception-java-util-arraysarraylist-cannot-be-cast-to-java
    //Arrays.asList returns a List implementation, but it's not a java.util.ArrayList. It happens to have a classname of ArrayList, but that's a nested class within Arrays - a completely different type from java.util.ArrayList.
    //If you need a java.util.ArrayList, you can just create a copy:
    static List<Integer> nums = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12));


    /**
     * @param n :
     * @Author : xieaichen
     * @Date : 2020/9/3 11:15
     * @Discription : 有些时候顺序会是错误的,前面会插入,最难的是大小顺序的问题
     */
    public static int nthUglyNumber(int n) {
        if (n < 11) {
            return nums.get(n);
        }
        while (n >= nums.size()) {
            //所有的  × 2/3/5,然后排序
//            int[] temp = new int[nums.length * 3];
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < nums.size(); i++) {
                list.add(nums.get(i) * 2);
                list.add(nums.get(i) * 3);
                list.add(nums.get(i) * 5);
            }
            // TODO: 2020/9/3  注意
//           Integer[] tempnums = list.stream().sorted().distinct().collect(Collectors.toList()).toArray(new Integer[list.size()]);
            nums.addAll(list);
            nums = nums.stream().sorted().distinct().collect(Collectors.toList());

//            System.out.println(nums);

            System.out.println(nums);
        }

        return nums.get(n);
    }

    public static void main(String[] args) {
        System.out.println(
                nthUglyNumber(13)
        );

    }

}
