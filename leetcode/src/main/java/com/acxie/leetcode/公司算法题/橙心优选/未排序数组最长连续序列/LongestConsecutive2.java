package com.acxie.leetcode.公司算法题.橙心优选.未排序数组最长连续序列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2021/01/17 15:27
 */
public class LongestConsecutive2 {

    /**
     * 放入set，任何一个元素只能存在一个排序序列中，如果存在两个中他们就可以连接
     *
     * @param nums
     */
    public static ArrayList<Integer> longestConsecutive(int[] nums) {
        // 规划掉就全部移除
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        //时间换空间
        while (set.iterator().hasNext()) {

            // 用max | min | 或list 去维持
//            int max = next;
//            int min = next;
            temp.add(set.iterator().next());

            for (; ; ) {
                if (set.contains(temp.get(0) - 1)) {
                    int min = temp.get(0) - 1;
                    temp.add(0, min);
                    set.remove(min);
                } else if (set.contains(temp.get(temp.size() - 1) + 1)) {
                    int max = temp.get(temp.size() - 1) + 1;
                    temp.add(temp.size(), max);
                    set.remove(max);
                } else {
                    break;
                }
            }
            if (temp.size() > nums.length + 1 / 2) {
                return temp;
            }
            //可以预返回
            if (temp.size() > result.size()) {
                result = temp;
            }
            temp = new ArrayList<>();

        }


        return result;
    }


    public static void main(String[] args) {
        int[] ints = {100, 4, 200, 1, 3, 2};
        ArrayList<Integer> list = longestConsecutive(ints);
        System.out.println(list);
    }
}
