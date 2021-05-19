package com.collection.Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example_NavigableSet
{
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet=new TreeSet<Integer>();
        navigableSet.add(100);
        navigableSet.add(200);
        navigableSet.add(300);
        navigableSet.add(400);
        navigableSet.add(500);
        navigableSet.add(600);
        navigableSet.add(700);
        navigableSet.add(800);
        navigableSet.add(900);
        navigableSet.add(1000);
        System.out.println(navigableSet);
        System.out.println(navigableSet.lower(600));
        System.out.println(navigableSet.higher(900));
        System.out.println(navigableSet.floor(200));
        System.out.println(navigableSet.ceiling(700));
        System.out.println(navigableSet.pollFirst());
        System.out.println(navigableSet.pollLast());
        System.out.println(navigableSet.descendingSet());

    }
}
