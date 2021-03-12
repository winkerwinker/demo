package com.acxie.leetcode.公司算法题.网易.瞌睡;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @description: 通过90% 超过时间了
 * @create: 2020/02/08 16:47
 */
public class 瞌睡 {


    private static void solution(List<Integer> interests, List<Integer> isSleep, int maxtime) {

        //遍历所有0点，放进一个map
        int part = 0;
        int part2 = 0;
        for (int i = 0; i < interests.size(); i++) {
            if (isSleep.get(i) == 0) {
                int temp = 0;
                for (int i1 = 0; i1 < maxtime && i1 + i < interests.size(); i1++) {
                    if (isSleep.get(i + i1) == 0) {
                        temp = temp + interests.get(i + i1);
                    }
                }
                part2 = temp > part2 ? temp : part2;
            } else {
                part += interests.get(i);
            }
        }


        System.out.println(part + part2);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int maxtime = sc.nextInt();
        List<Integer> interests = new ArrayList<>();
        List<Integer> isSleep = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            interests.add(sc.nextInt());
        }
        for (int i = 0; i < count; i++) {
            isSleep.add(sc.nextInt());
        }


        solution(interests, isSleep, maxtime);
    }


}
