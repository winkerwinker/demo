package com.acxie.leetcode.公司算法题.橙心优选.众数;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

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
public class MajorityElement1 {

    /**
     * @param nums
     * @return 使用hashmap
     * <p>
     * todo 错误、找到最大的value但是无法映射到key
     */
    public int majorityElement(int[] nums) {
        int size = (nums.length + 1 )/ 2;

        System.out.println(size);
        Map<Integer, Long> collect = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(a -> a, Collectors.counting()));

        collect.forEach((a, b) -> System.out.println(a+ "---" + b));

        for (Map.Entry<Integer, Long> entry : collect.entrySet()) {
            if (entry.getValue() >= size) {
                return entry.getKey();
            }

        }
        return 0;
    }


    public static void main(String[] args) {

    }
}
