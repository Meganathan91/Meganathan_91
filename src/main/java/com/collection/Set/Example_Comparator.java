package com.collection.Set;
import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{
       @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
           String s2=o2.toString();
           return s2.compareTo(s1);
    }
}
public class Example_Comparator
{
    public static void main(String[] args) {
        TreeSet<Object> set=new TreeSet<Object>(new MyComparator());
        set.add(new StringBuffer("BU"));
        set.add(new StringBuffer("Soft"));
        set.add(new StringBuilder("Technology"));
        set.add("Welcomes");
        set.add("You");
        System.out.println(set);

    }
}
