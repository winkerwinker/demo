package com.acxie.demo.loggerlearn.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/14 14:29
 */

public class Test {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.printf(list.toString());
        for (String i : list
        ) {
            System.out.printf(i);
        }

            for (int i = 0; i <list.size() ; i++) {
                System.out.printf(list.get(i));
        }
    }
}
