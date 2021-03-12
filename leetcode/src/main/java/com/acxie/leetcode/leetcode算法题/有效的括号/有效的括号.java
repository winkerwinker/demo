package com.acxie.leetcode.leetcode算法题.有效的括号;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/2 15:51
 */

public class 有效的括号 {


//    static Map<String, String> map = ImmutableMap.<String, String>builder()
//            .put("{", "}")
//            .put("(", ")")
//            .put("[", "]")
//            .build();

    static Map<String, String> map = new HashMap<String, String>();


    public static boolean isValid(String s) {
        if (map.isEmpty()) {
            map.put("{", "}");
            map.put("(", ")");
            map.put("[", "]");
        }
        List<String> a = Arrays.stream(s.split("")).collect(Collectors.toList());
        return isValid1(a);
    }


    public static boolean isValid1(List<String> list) {

        Stack<String> stack = new Stack<>();
//        Stack<String> stack1 = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            if (stack.isEmpty() || !coupleOf((stack.peek()), list.get(i))) {
                stack.push(list.get(i));
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private static boolean coupleOf(String s, String peek) {
        return map.containsKey(s) && map.get(s).equals(peek);
    }

    public static void main(String[] args) {


        System.out.print(isValid(""));
    }
}
