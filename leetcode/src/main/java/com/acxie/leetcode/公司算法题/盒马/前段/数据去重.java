package com.acxie.leetcode.公司算法题.盒马.前段;

import java.util.Arrays;

/**
 * @description: fn([0, 1, 2, ' 1 ', ' 1 ', 3, ' 3 ' ]) =>[0, 1, 2, '1',, 3, '3']
 * @create: 2020/12/01 23:35
 */
public class 数据去重 {
    //hashset
    public static int slove(int[] ints) {
        int[] ints1 = Arrays.stream(ints).distinct().toArray();
        System.out.println(Arrays.toString(ints1));
        return  1;


    }


    public static void main(String[] args) {

        int slove = slove(new int[]{1, 2, 2, 2, 4, 4});
        System.out.println(slove);

    }

}


//class Node {
//    Node left;
//    Node right;
//    int val;
//
//    public Node(int val) {
//        this.val = val;
//    }
//
//    public Node getLeft() {
//        return left;
//    }
//
//    public void setLeft(Node left) {
//        this.left = left;
//    }
//
//    public Node getRight() {
//        return right;
//    }
//
//    public void setRight(Node right) {
//        this.right = right;
//    }
//
//    public int getVal() {
//        return val;
//    }
//
//    public void setVal(int val) {
//        this.val = val;
//    }
//}
