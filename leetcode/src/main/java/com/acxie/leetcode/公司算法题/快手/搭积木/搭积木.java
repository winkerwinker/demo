    package com.acxie.leetcode.公司算法题.快手.搭积木;


    import java.util.ArrayList;
    import java.util.Comparator;
    import java.util.List;
    import java.util.Scanner;

    /**
     * @description:
     * @create: 2020/02/24 20:32
     */
    public class 搭积木 {

        public static void main(String[] args) {

            System.out.println(Double.MAX_VALUE);
            System.out.println(Double.MAX_VALUE/2147483647);
            System.out.println(Double.MAX_VALUE/2147483647>Integer.MAX_VALUE);
           double a= (double)(Integer.MAX_VALUE*Integer.MAX_VALUE);
            System.out.println(a);
            System.out.println(Integer.MAX_VALUE);
            System.out.println(Integer.MAX_VALUE);
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            List<Double> list = new ArrayList<>();
            for (int i = 0; i < input; i++) {
                int width = sc.nextInt();
                int length = sc.nextInt();
                int temp = 0;
                if (width > length) {
                    temp = width;
                    width = length;
                    length = temp;
                }
                list.add((double) width * Integer.MAX_VALUE + length);
            }
            list.sort(new Comparator<Double>() {
                @Override
                public int compare(Double o1, Double o2) {
                    return (int) (o1 - o2);
                }
            });
            //找出有多少个连续反序数字
            solution(list);
        }

        private static void solution(List<Double> list) {
//            list.
            int count = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) % Integer.MAX_VALUE > list.get(i + 1) % Integer.MAX_VALUE) {
                    count++;
                }
            }
            System.out.println(list.size() - count);
        }


    }
    //todo 计算的时候就会有精度损失