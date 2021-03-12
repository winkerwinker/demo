package com.acxie.leetcode.leetcode算法题.速度随时间变化;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020/03/15 23:04
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        if (time < 0) {
            System.out.println("请输入正确时间");
        } else if (time < 1779 || (time > 1800 && time < 3599) || time > 3600) {
            System.out.println("当前速度为" + 0);
        }else{
            System.out.println("当前速度为" + 70);
        }
    }
}
