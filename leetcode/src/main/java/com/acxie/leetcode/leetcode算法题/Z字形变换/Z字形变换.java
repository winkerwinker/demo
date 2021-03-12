package com.acxie.leetcode.leetcode算法题.Z字形变换;

import java.util.ArrayList;
import java.util.List;

public class Z字形变换 {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int counts = s.length() / (2 * numRows - 2);
        int rest = s.length() % (2 * numRows - 2);
        System.out.println(counts + "   " + rest);
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList();
        int start = 0;
        for (int i = 0; i < counts; i++) {
            list.add(s.subSequence(start, start + 2 * numRows - 2).toString());
            start = start + 2 * numRows - 2;
        }

        StringBuilder temp = new StringBuilder(s.subSequence(start, s.length()));
        for (int i = 0; i < 2 * numRows - 2 - rest; i++) {
            temp.append(" ");
        }
        list.add(temp.toString());
        //补齐全

        System.out.println(list);
        System.out.println(sb);
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                for (int k = 0; k < counts + 1; k++) {
                    sb.append(list.get(k).charAt(0));
                }
            } else if (i == numRows - 1) {
                for (int k = 0; k < counts + 1; k++) {
                    sb.append(list.get(k).charAt(numRows - 1));
                }
            } else {
                for (int j = 0; j < counts + 1; j++) {
                    sb.append(list.get(j).charAt(i)).append(list.get(j).charAt(2 * numRows - 2 - i));
                }
            }
        }

        return sb.toString().replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(Z字形变换.convert("PAYPALISHIRING", 3));
    }

}
