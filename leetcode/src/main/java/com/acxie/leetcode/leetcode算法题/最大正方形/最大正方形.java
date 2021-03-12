package com.acxie.leetcode.leetcode算法题.最大正方形;

public class 最大正方形 {


    public static int maximalSquare(char[][] matrix) {

        int max = 1;
        boolean allempty = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char now = matrix[i][j];
                System.out.print(now + "  ");
                if (now != '0') {
                    allempty = false;
                    if (i + max + 1 <= matrix.length && j + max + 1 <= matrix[i].length) {
                        int len = Math.min(matrix.length - i, matrix[i].length - j);
                        boolean flag = true;
                        int tempmax = 1;
                        for (int k = 1; k < len; k++) {
                            for (int l = 0; l <= k; l++) {
                                if (matrix[i + k][j + l] == '0' || matrix[i + l][j + k] == '0') {
                                    flag = false;
                                }
                                if (!flag) {
                                    break;
                                }
                            }
                            if (flag) {
                                tempmax++;
                            } else {
                                break;
                            }
                        }
                        if (tempmax > max) {
                            max = tempmax;
                        }
                    }
                }
            }
            System.out.println();
        }
        if (allempty) {
            return 0;
        }
        return max * max;
    }

    public static void main(String[] args) {
//        char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        char[][] matrix = new char[][]{{'1', '1'}, {'1', '1'}};
        System.out.println(maximalSquare(matrix));
    }

}
