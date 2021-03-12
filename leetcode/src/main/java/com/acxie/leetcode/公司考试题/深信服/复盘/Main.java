package com.acxie.leetcode.公司考试题.深信服.复盘;


import java.util.*;

/**
 * @description:
 * @create: 2020/02/20 18:59
 */
public class Main {



    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int time = sc.nextInt();
//        int count = sc.nextInt();
//        List<String> str = new ArrayList<String>();
//        for (int i = 0; i < count; i++) {
//            String temp = sc.next();
//            str.add(temp.substring(2, temp.length() - 1));
//        }
//        System.out.println(str);


//        help(time, str);
        toAns(1000, "(n*g(n*g(n)))");
    }

    private static void toAns(int time, String str) {
        Stack<String> symbols = new Stack<String>();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ')') {
                symbols.push(")");
            } else if (str.charAt(i) == '(') {
                String a = symbols.pop();
                double b = to(a);
                symbols.pop();
                symbols.push(b + "");
            } else {
                if (symbols.peek() == ")") {
                    symbols.push(str.charAt(i) + "");
                } else {
                    symbols.push(str.charAt(i) + symbols.pop());
                }
            }
        }
        System.out.println(Double.valueOf(symbols.pop()).intValue());
    }

    private static double to(String str) {
        List<String> a = Arrays.asList(str.split("[*]"));
        double result = 1;
        for (int i = 0; i < a.size(); i++) {
            double temp = 0;
            if (a.get(i).contains("g")) {
                temp = Math.log(new Double(a.get(i).substring(1))) / Math.log(2);
            } else if (a.contains("s")) {
                temp = Math.sqrt(new Double(a.get(i).substring(1)));
            } else if (a.get(i).contains("n")) {
                temp = new Double("10000");
            } else {
                temp = Double.valueOf(a.get(i));
            }
            result *= temp;
        }
        return result;
    }


}



/**


 10000 6
 O(n*n)
 O(n*n*n)
 O(sqrt(n))
 O(lg(n))
 O(n*lg(n))
 O(n*lg(n*lg(n)))


 [n*n, n*n*n, sqrt(n), lg(n), n*lg(n), n*lg(n*lg(n))]


 10000*10000
 10000*10000*10000
 144.26950408889635
 13.28771237954945
 10000*13.28771237954945
 10000*10000*13.28771237954945
 */