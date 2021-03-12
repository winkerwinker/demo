package com.acxie.leetcode.公司算法题.网易.牛牛的闹钟;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020/02/08 00:56
 */
public class 牛牛的闹钟 {
    private static void solution(List<Time> clock, Time rest, Time endtime) {
        clock.sort(new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                return -(o1.getHour() * 100 + o1.getMin() - o2.getHour() * 100 - o2.getMin());
            }
        });
        System.out.println(clock);
        //逆序排列
        for (int i = 0; i < clock.size(); i++) {
            //true的话就是大于
            if (!clock.get(i).add(rest).compare(endtime)) {
                System.out.println(clock.get(i).hour + " " + clock.get(i).getMin());
                return;
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Time> clock = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            clock.add(new Time(sc.nextInt(), sc.nextInt()));
        }
        int resettime = sc.nextInt();
        Time rest = new Time(resettime / 60, resettime % 60);
        Time endtime = new Time(sc.nextInt(), sc.nextInt());

        solution(clock, rest, endtime);
    }


}

class Time {
    int hour;
    int min;

    public Time(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return hour + ": " + min;
    }

    public Time add(Time time) {
        return new Time((this.min + time.getMin()) / 60 + this.hour + time.hour, (this.min + time.getMin()) % 60);
    }


    public boolean compare(Time time) {
        if (this.hour > time.hour) {
            return true;
        }
        if (this.hour >= time.hour && this.min > time.min) {
            return true;
        }
        return false;
    }


}
