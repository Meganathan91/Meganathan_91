package com.collection.Map;

import java.util.Comparator;
import java.util.TreeMap;
class CustomSortingInteger implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        String i1=(String)o1;
        String i2=(String)o2;
        return -i1.compareTo(i2);
    }
}
public class Example_SortingComparatore
{
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap=new TreeMap(new CustomSortingInteger());
        treeMap.put("Tamil",80);
        treeMap.put("English",60);
        treeMap.put("Maths",80);
        treeMap.put("Science",70);
        treeMap.put("Social",70);
        System.out.println(treeMap);
    }
}
