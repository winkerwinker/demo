package com.acxie.leetcode.leetcode公司题.腾讯.Nim游戏;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/16 15:55
 */


//给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
//原地 修改输入数组

//记忆化递归（超出内存限制） 和 动态规划的区别
public class Nim游戏_dp递归 {

    // todo 使用包装类型的布尔数组，可以用 null 这个状态，表示当前 n 的结果还没有被计算出来
    static Boolean[] booleans;

    public static boolean canWinNim(int n) {
        //0-n个石子
        booleans = new Boolean[n + 1];
        return dfs(n);
    }


    public static boolean dfs(int n) {
        // 判断一个n 是否曾经访问过
        if (booleans[n] != null) {
            return booleans[n];
        }
        if (n <= 3) {
            return true;
        }
        //如果有任何一个胜利的机会
        if (!dfs(n - 1) || !dfs(n - 2) || !dfs(n - 3)) {
            booleans[n] = true;
            return true;
        }
        booleans[n] = false;
        return false;
    }


    public static void main(String[] args) {
        boolean b = canWinNim(7);
        System.out.println(b);
    }
}
