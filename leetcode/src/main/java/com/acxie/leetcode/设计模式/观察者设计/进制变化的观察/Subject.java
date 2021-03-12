package com.acxie.leetcode.设计模式.观察者设计.进制变化的观察;

import java.util.ArrayList;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/7 10:10
 */

public class Subject {

    int state;
    ArrayList<Observe> observes = new ArrayList<Observe>();

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setObserve(new HexObserve());
        subject.setObserve(new BinObserve());
        subject.setObserve(new OctObserve());
        subject.setState(7);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserve();
    }

    public void setObserve(Observe observe) {
        observes.add(observe);
    }

    public void notifyAllObserve() {
        for (int i = 0; i < observes.size(); i++) {
            observes.get(i).modify();
        }
    }

    public void setObserves(ArrayList<Observe> observes) {
        this.observes = observes;
    }
}
