    package com.acxie.leetcode.公司算法题.搜狐畅游.找到最近的NPC;

    import java.util.*;
    import java.util.stream.Collectors;

    /**
     * @description:
     * @create: 2020/02/25 17:08
     */
    //假设地图大小为128*128
    public class 找到最近的NPC {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            //32,48,3,33,40,40,50,32,45
    //        try {

            List<Integer> list = Arrays.asList(a.split(",")).stream().map(A -> Integer.valueOf(A.trim())).collect(Collectors.toList());
            int x = list.get(0);
            int y = list.get(1);
            int rex = 0;
            int rey = 0;
            int outdis = Integer.MAX_VALUE;
            for (int i = 3; i < list.size(); i += 2) {
                int dis = Math.abs(list.get(i) - x) + Math.abs(list.get(i + 1) - y);
                if (dis < outdis) {
                    rex = list.get(i);
                    rey = list.get(i + 1);
                }
                outdis=dis;
            }

            System.out.println("(" + rex + "," + rey + ")");
    //        }catch (Exception e){
    //            System.out.println(a);
    //        }


        }
    }
