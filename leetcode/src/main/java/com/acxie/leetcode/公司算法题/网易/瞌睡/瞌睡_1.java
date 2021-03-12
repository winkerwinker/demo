package com.acxie.leetcode.公司算法题.网易.瞌睡;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description: 使用一层循环
 * @create: 2020/02/08 16:47
 */
public class 瞌睡_1 {


    private static void solution(List<Integer> interests, List<Integer> isSleep, int maxtime) {

        //遍历所有0点，放进一个map
        int part = 0;
        int part2 = 0;
        for (int i = 0; i < maxtime; i++) {
            if (isSleep.get(i) == 0) {
                part2 += interests.get(i);
            } else {
                part += interests.get(i);
            }
        }
        int temppart2 = part2;
        for (int i = maxtime; i < interests.size(); i++) {
            int from = isSleep.get(i - maxtime) == 1 ? 0 : -interests.get(i - maxtime);
            int to = isSleep.get(i) == 1 ? 0 : interests.get(i);
            temppart2 = temppart2 + from + to;
//            System.out.println(temppart2);
            if (temppart2 > part2) {
                part2 = temppart2;
            }
//            System.out.println(part2);
//            System.out.println("-----");
            if (isSleep.get(i) == 1) {
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
