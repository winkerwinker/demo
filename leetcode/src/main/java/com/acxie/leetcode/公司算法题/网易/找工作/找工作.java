package com.acxie.leetcode.公司算法题.网易.找工作;


import java.util.*;

/**
 * @description:每个人只能找一份工作
 * @create: 2020/02/07 17:06
 */
public class 找工作 {


    public static void solution(List<Job> list, List<People> peoples) {
        list.sort(new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                //从小到大
                return o2.getSalary() - o1.getSalary();
            }
        });

        peoples.sort(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o2.getAbility() - o1.getAbility();
            }
        });

        int i = 0;//人的工作能力
        int j = 0;
        while (i < peoples.size() && j < list.size()) {
            if (peoples.get(i).getAbility() >= list.get(j).getNeed()) {
                peoples.get(i).setMaxsalsry(list.get(j).getSalary());
                i++;
            } else {
                j++;
            }
        }


        peoples.sort(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.getNum() - o2.getNum();
            }
        });

//        System.out.println(result);
        for (int k = 0; k < peoples.size(); k++) {
            System.out.println(peoples.get(k).getMaxsalsry());
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jobcount = sc.nextInt();
        int peoplecount = sc.nextInt();
        List<Job> list = new ArrayList<>();
        List<People> ability = new ArrayList<>();
        for (int i = 0; i < jobcount; i++) {
            list.add(new Job(sc.nextInt(), sc.nextInt()));
        }
        for (int i = 0; i < peoplecount; i++) {
            ability.add(new People(i, sc.nextInt()));
        }
        solution(list, ability);

    }
}

class Job {
    public int salary;
    public int need;

    public Job(int need, int salary) {
        this.salary = salary;
        this.need = need;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNeed() {
        return need;
    }

    @Override
    public String toString() {
        return "Job{" +
                "salary=" + salary +
                ", need=" + need +
                '}';
    }

    public void setNeed(int need) {
        this.need = need;
    }

}


class People {
    int num;
    int ability;
    int salary = 0;

    public int getMaxsalsry() {
        return salary;
    }

    public void setMaxsalsry(int maxsalsry) {
        this.salary = maxsalsry;
    }

    public People(int num, int ability) {
        this.num = num;
        this.ability = ability;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "People{" +
                "num=" + num +
                ", ability=" + ability +
                ", salary=" + salary +
                '}';
    }
}