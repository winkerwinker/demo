package com.acxie.leetcode.公司算法题.携程;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/01/28 20:52
 */
public class 查询满足区间的记录 {


    public static void test(int target, List<Record> records) {
        List<Integer> list = new ArrayList<>();
        for (Record record : records) {
            if (record.begin <= target && record.end >= target) {
                list.add(record.num);
//                System.out.println(record.num);
//                flag=true;
            }
        }


        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });


        if (list.isEmpty()) {
            System.out.println("null");
        } else {

            for (Integer a : list
            ) {
                System.out.println(a);
            }
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int target = scanner.nextInt();

        List<Record> records = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Record a = new Record(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            records.add(a);
        }
        test(target, records);

    }
}


class Record {
    int num;
    int begin;
    int end;

    public Record(int num, int begin, int end) {
        this.num = num;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Record{" +
                "num=" + num +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }
}