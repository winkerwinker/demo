package com.acxie.leetcode.leetcode算法题.杨辉三角;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:暴力
 * @create: 2020/02/03 14:17
 */
public class 杨辉三角 {


    List<List<Integer>> list = new ArrayList<List<Integer>>();

    public List<List<Integer>> generate(int numRows) {
        if (numRows==0){
            return list;
        }
        int now = 1;
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> nowlist = new ArrayList<>();
        pre.add(1);
        list.add(new ArrayList<>(pre));
        while (numRows >= now + 1) {
            for (int i = 0; i <= pre.size(); i++) {
                if (i == 0 || i == pre.size()) {
                    nowlist.add(1);
                } else {
                    nowlist.add(pre.get(i - 1) + pre.get(i));
                }
            }
            pre = new ArrayList<>(nowlist);
            list.add(pre);
            nowlist.clear();
            now++;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new 杨辉三角().generate(5));

    }
}
