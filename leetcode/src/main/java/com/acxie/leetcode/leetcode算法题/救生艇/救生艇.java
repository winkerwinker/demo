package com.acxie.leetcode.leetcode算法题.救生艇;

import java.util.Arrays;

public class 救生艇 {

    public static int numRescueBoats_1(int[] people, int limit) {
        int count = 0;
        int temp;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = i + 1; j < people.length; j++) {
                if (people[i] < people[j]) {
                    temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }

        int j = people.length - 1;
        for (int i = 0; i <= j; i++) {
            if (people[i] == limit||i==j) {
                count++;
            } else {
                int now = j;
                int total = people[i];
                while (total + people[j] <= limit && i < j) {
                    total += people[j];
                    j = j - 1;
                }
                count++;

            }
        }

        return count;
    }

    public static int numRescueBoats_2(int[] people, int limit) {
        int count = 0;
        int temp;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = i + 1; j < people.length; j++) {
                if (people[i] < people[j]) {
                    temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }

        int j = people.length - 1;
        int i = 0;
        while (i <= j) {
            if (people[i] == limit || i == j) {
                i++;
                count++;
            } else {
                int total = people[j];
                j = j - 1;

                /**
                 * 需要注意的地方
                 */
                while (j >= 0 && total + people[j] <= limit && i <= j) {

                    total += people[j];
                    j = j - 1;

                }
                count++;

            }
        }
        System.out.println(Arrays.toString(people));
        return count;
    }

    public static int numRescueBoats(int[] people, int limit) {
     return Math.min(numRescueBoats_1(people,limit),numRescueBoats_2(people,limit));
    }

    public static void main(String[] args) {
      //  System.out.println(救生艇.numRescueBoats(new int[]{2, 49, 10, 7, 11, 41, 47, 2, 22, 6, 13, 12, 33, 18, 10, 26, 2, 6, 50, 10}, 50));
        System.out.println(救生艇.numRescueBoats(new int[]{5, 1,4,2}, 6));
    }
}
