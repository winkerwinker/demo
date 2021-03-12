package com.acxie.leetcode.公司算法题.橙心优选.反转链表.反转打印链表.struct;

/**
 * @description:链表结构
 * @create: 2021/01/17 16:41
 */
public class DidiNode {

    Integer value;
    DidiNode next;


    public static DidiNode genDidiNoe(int[] ints, int i) {

        if (i == ints.length) {
            return null;
        }
        return new DidiNode(ints[i], genDidiNoe(ints, i + 1));
    }


    public static DidiNode genDidiNoe(int[] ints) {
        return genDidiNoe(ints, 0);
    }


    public DidiNode(Integer value, DidiNode next) {
        this.value = value;
        this.next = next;
    }

    public DidiNode(Integer value) {
        this.value = value;
    }


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public DidiNode getNext() {
        return next;
    }



    public void setNext(DidiNode next) {
        this.next = next;
    }
}

