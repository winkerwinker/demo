package com.acxie.leetcode.剑指offer.数组中出现次数超过一半的数字;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/9 14:28
 */


/**
 * 1.数组排序法： 将数组 nums 排序，由于众数的数量超过数组长度一半，因此 数组中点的元素 一定为众数。 (排序的复杂度)
 * 2.哈希表统计法： 需要统计每个数字出现的个数，虽然时间复杂度是O(N)，但是空间复杂度也是O(N)
 * 3. 摩尔投票法： 核心理念为 “正负抵消” ；时间和空间复杂度分别为 O(N) 和 O(1)；是本题的最佳解法。
 * <p>
 * 要点：如何不用记录每个数的长度
 * 1. 投票法简单来说就是不同则抵消，占半数以上的数字必然留到最后。
 * 2. 为什么答案能写那么长呢。。。核心就是对拼消耗。玩一个诸侯争霸的游戏，假设你方人口超过总人口一半以上，并且能保证每个人口出去干仗都能一对一同归于尽。最后还有人活下来的国家就是胜利。那就大混战呗，最差所有人都联合起来对付你（对应你每次选择作为计数器的数都是众数），或者其他国家也会相互攻击（会选择其他数作为计数器的数），但是只要你们不要内斗，最后肯定你赢。最后能剩下的必定是自己人。
 * <p>
 * 超过半数
 */
public class 数组中出现次数超过一半的数字_摩尔投票法 {

    public static int majorityElement(int[] nums) {

        int x = 0;
        int vote = 0;
        for (int a : nums) {
            if (vote == 0) {
                x = a;
                vote++;
            } else {
                if (x != a) {
                    vote--;
                    //todo 无效逻辑
                    if (vote == 0) {
                        //如果投票==0，后面会重新赋值
                        x = 0;
                    }
                } else {
                    vote++;
                }
            }
        }
        return x;
    }


    public static int majorityElement1(int[] nums) {

        int x = 0;
        int vote = 0;
        for (int a : nums) {
            //设置标杆
            if (vote == 0) x = a;
            vote += x == a ? 1 : -1;

        }
        return x;
    }

    public static void main(String[] args) {
        int[] ints = {3, 3, 4};
        int i = majorityElement1(ints);
        System.out.println(i);
    }
}
