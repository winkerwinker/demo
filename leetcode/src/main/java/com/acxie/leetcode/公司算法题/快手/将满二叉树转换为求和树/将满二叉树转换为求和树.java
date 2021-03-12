package com.acxie.leetcode.公司算法题.快手.将满二叉树转换为求和树;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @description:因为满二叉树只需要中序遍历 即可退出二叉树形状，但是不用构建，只需要用二分法理清每个节点之间的关系，利用递归即可求解。
 * @create: 2020/02/24 19:24
 */
public class 将满二叉树转换为求和树 {


    static List<Integer> result = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> a = Arrays.asList(sc.nextLine().split(" ")).stream().map(q -> Integer.valueOf(q)).collect(Collectors.toList());
//        List<Integer> a = Arrays.asList(8, -2, -4, 10, 7, 6, 5);

        for (int i = 0; i < a.size(); i++) {
            result.add(0);
        }
        solution(a, 0, a.size() - 1);
//        System.out.println(a);
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                System.out.print(result.get(i));
            } else {
                System.out.print(result.get(i) + " ");
            }
        }
    }

    private static int solution(List<Integer> list, int left, int right) {
        int center = (right + left) / 2;
        if (right - left == 2) {
            result.set(center, list.get(left) + list.get(right));
            return list.get(center);
        }

        int cleft = solution(list, left, center - 1);
        int cright = solution(list, center + 1, right);
        result.set(center, cleft + cright + result.get((left + center - 1) / 2) + result.get((center + 1 + right) / 2));
        return result.get(center);
    }


}
