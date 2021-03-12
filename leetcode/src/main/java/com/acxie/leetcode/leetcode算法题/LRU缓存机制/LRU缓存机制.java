package com.acxie.leetcode.leetcode算法题.LRU缓存机制;


import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/3 13:02
 */

//运用你所掌握的数据结构，设计和实现 LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
//
//获取数据 get(key) - 如果关键字 (key) 存在于缓存中，则获取关键字的值（总是正数），否则返回 -1。
//写入数据 put(key, value) - 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字/值」。当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。


public class LRU缓存机制 {


}

class LRUCache {

    Map<Integer, Integer> map = new HashMap();

    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;

    }

    public static void main(String[] args) {


    }

    public int get(int key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
//        防御式编程
        if (map.containsKey(key)) {
            return;
        }
        if (map.entrySet().size() >= capacity) {
            removeLRU();
        }
        map.put(key, value);
    }

    private void removeLRU() {
        //Comparable sorted(Map.Entry.comparingByValue()).
        //得到最小值
        Map.Entry<Integer, Integer> max0 = map.entrySet().stream().min(Map.Entry.comparingByValue()).get();
        System.out.println(max0.getKey() + "  " + max0.getValue());
        map.remove(max0.getKey());
    }
}