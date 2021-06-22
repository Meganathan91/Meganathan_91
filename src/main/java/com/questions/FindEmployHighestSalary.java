package com.Doubts;

import java.util.*;

class Emp {
    public String name;
    public String desc;
    public int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Emp(String ram, String hr, int i) {
        this.name = ram;
        this.desc = hr;
        this.salary = i;
    }
}

public class FindEmployHighestSalary {

    public static void main(String[] args) {
        List<Emp> list = new ArrayList<Emp>();
        list.add(new Emp("Ram", "hr", 1000));
        list.add(new Emp("Raj", "hr", 2000));
        list.add(new Emp("Rahim", "hr", 3000));
        ListIterator iterator = list.listIterator();
        int maxSalary = 0;
        int sal = 0;
        Emp s=null;
        while (iterator.hasNext()) {
             s = (Emp) iterator.next();
            sal = s.getSalary();
            if (sal > maxSalary) {
                maxSalary = sal;
            }
        }
        System.out.println(maxSalary);
    }
}
