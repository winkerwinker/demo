package com.acxie.leetcode.公司算法题.盒马;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @create: 2020/12/01 09:28
 */
public class 跳跃游戏 {

    public static void main(String[] args) {


    }
//dfs 或者bfs

    public boolean canJump(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i++) {
            //搜索所有能到达
            if ((nums[i] + i) == nums.length) {
                list.add(i);
            }

        }
        return false;

    }
}
