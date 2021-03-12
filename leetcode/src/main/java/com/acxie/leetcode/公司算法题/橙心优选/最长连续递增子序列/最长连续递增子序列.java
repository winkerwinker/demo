package com.acxie.leetcode.公司算法题.橙心优选.最长连续递增子序列;

/**
 * @description: 输入：nums = [1,3,5,4,7]
 * 输出：3
 * 解释：最长连续递增序列是 [1,3,5], 长度为3。
 * 尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为 5 和 7 在原数组里被 4 隔开。
 * @create: 2021/01/24 17:49
 */
public class 最长连续递增子序列 {


    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int max = 1;
        // todo 错误点
        int temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                max = Math.max(max, ++temp);
            } else {
                // todo 错误点
                temp = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int lengthOfLCIS = findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});
        System.out.println(lengthOfLCIS);

    }

}
