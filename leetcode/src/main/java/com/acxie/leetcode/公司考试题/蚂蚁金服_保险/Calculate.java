package com.acxie.leetcode.公司考试题.蚂蚁金服_保险;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @description: 使用stream流操作获得结果
 * @create: 2021/02/05 22:24
 */
public class Calculate {

    public static final String FILTER_KEY_WORD = "马";

    public static Double fun(Student[] students) {
        Double avergeAge = Arrays.stream(students).sorted(Comparator.comparingInt(Student::getAge))
                .filter(student -> !student.getName().contains(FILTER_KEY_WORD))
                .collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(stu -> stu.getName()))), ArrayList::new))
                .stream()
                .collect(Collectors.averagingInt(Student::getAge));

        return avergeAge;
    }

    public static void main(String[] args) {
        Student stu1 = new Student("马小明", 25);
        Student stu2 = new Student("马小明", 18);
        Student stu3 = new Student("小马明", 18);
        Student stu4 = new Student("小谢", 10);
        Student stu5 = new Student("小二", 50);
        Student stu6 = new Student("小二", 50);
        Student[] students = {stu1, stu2, stu3, stu4, stu5, stu6};
        Double avergeAge = Calculate.fun(students);
    }
}


/**
 * @description: 学生对象
 * @create: 2021/02/05 22:24
 */
class Student{

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}