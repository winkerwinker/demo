package com.acxie.leetcode.公司算法题.橙心优选.众数;

/**
 * @description: 多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[3,2,3]
 * 输出：3
 * 示例 2：
 * <p>
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create: 2021/01/17 14:12
 * <p>
 * <p>
 * 尝试使用空间复杂度为o(1) 解决
 */
public class MajorityElement3 {

    /**
     * @param nums
     * @return 摩尔投票法
     * 每个“多数元素”和其他元素 两两相互抵消
     * <p>
     */
    public static int majorityElement(int[] nums) {
        int count = 0, sentinel = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                sentinel = nums[i];
                count = 1;
            } else {
                if (sentinel == nums[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return sentinel;
    }


    public static void main(String[] args) {
        //int[] ints = {1};
        int[] ints = {1, 1, 2, 2};
        // int[] ints = {233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 233, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333, 2333};
        int i = majorityElement(ints);
        System.out.println(i);

    }
}
