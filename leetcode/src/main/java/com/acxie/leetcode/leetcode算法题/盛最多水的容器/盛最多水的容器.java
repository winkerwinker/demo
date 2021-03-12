package com.acxie.leetcode.leetcode算法题.盛最多水的容器;


public class 盛最多水的容器 {
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max= (j-i)*Integer.min(height[j],height[i])>max? (j-i)*Integer.min(height[j],height[i]):max;
               // System.out.println(max);
            }

        }
        return max;

    }


    public static void main(String[] args) {

        System.out.println(盛最多水的容器.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
