package com.acxie.laernjdk.feartrue_8.consumer_producer;

import java.util.Optional;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/26 14:57
 */

public class OptionalTest {


    public static void main(String[] args) {

//        Person ps = new Person();
        Person ps = null;
        Optional<Person> newps = Optional.ofNullable(ps);

//return Optional.ofNullable(str).map(String::length).orElse(0); 语句
    }
}

class Person {
    String name;

}

