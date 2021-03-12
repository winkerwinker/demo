package com.acxie.leetcode.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @create: 2020/02/20 21:19
 */
public class 正则 {


    public static void main(String[] args) {
        test1();
    }


    public static void test1() {
        //这段代码之所以使用两个反斜线符号“\\”，是因为在java中，与regex有关的包，并不都能理解和识别反斜线字符\,
        String str = "O(n*lg(n*n))";
        String regEx = "(.*)(lg[(].*[)])";

        Pattern pat = Pattern.compile(regEx);
        Matcher mat = pat.matcher(str);

        if (mat.find())
            System.out.println(mat.group(0));
        else
            System.out.println("Not find");

    }

    //使用正则表达式替换（保留部分内容不变）
    public static void test2() {

        String str = "你好，程序员，hello";
        //f分段group
        str = str.replaceAll("(.*)(程序员)(.*)", "$1工程师$3");
        System.out.println(str);


    }

    //使用正则表达式替换（使用group）
    public static void test3() {
        //使用正则表达式替换（保留部分内容不变）
        String str = "你好，程序员，hello";
        //f分段group
        str = str.replaceAll("(.*)(程序员)(.*)", "$1工程师$3");
        System.out.println(str);


    }


}
