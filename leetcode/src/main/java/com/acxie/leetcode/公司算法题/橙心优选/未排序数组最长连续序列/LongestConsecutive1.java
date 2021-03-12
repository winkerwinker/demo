package com.acxie.leetcode.公司算法题.橙心优选.未排序数组最长连续序列;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2021/01/17 15:27
 */
public class LongestConsecutive1 {

    /**
     * todo
     *
     * @param nums
     */
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int result = 1;

        while (set.iterator().hasNext()) {
            int max = set.iterator().next();
            int min = set.iterator().next();
            set.remove(min);

            while (set.contains(min - 1)) {
                set.remove(--min);
            }
            while (set.contains(max + 1)) {
                set.remove(++max);
            }
            result = Math.max(result, (max - min) + 1);

        }
        return result;
    }


    public static void main(String[] args) {
        int[] ints = {100, 4, 200, 1, 3, 2};
        int i = longestConsecutive(ints);

        System.out.println(i);
    }
}
