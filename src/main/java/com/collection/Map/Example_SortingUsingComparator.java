package com.collection.Map;

import java.util.Comparator;
import java.util.TreeMap;
class MyComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=(String) o2;
        return s2.compareTo(s1);
    }
}
public class Example_SortingUsingComparator {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap=new TreeMap(new MyComparator());
        treeMap.put("Tamil",80);
        treeMap.put("English",60);
        treeMap.put("Maths",80);
        treeMap.put("Science",70);
        treeMap.put("Social",70);
        System.out.println(treeMap);
    }
}
