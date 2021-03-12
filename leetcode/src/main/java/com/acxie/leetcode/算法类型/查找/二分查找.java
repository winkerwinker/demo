package com.acxie.leetcode.算法类型.查找;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/1 10:15
 */

public class 二分查找 {

    public static int solution(List<Integer> list, int taget) {
        int i = 0;
        int j = list.size() - 1; // size =3 下标=2
        while (i <= j) {
            int mid = (i + j) / 2; //总是向前一格
            if (list.get(mid) < taget) {
                i = mid + 1;
            } else if (list.get(mid) > taget) {
                j = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        String str = "5,7,8,9,10,31";
        List<Integer> list = Arrays.asList(str.split(",")).stream().map(A -> Integer.valueOf(A.trim())).collect(Collectors.toList());
        int x = solution(list, 31);
        System.out.print(x);
    }
}
