package com.collection.Map;

import java.util.Comparator;
import java.util.TreeMap;
class CustomSortingInteger implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;
        return -i1.compareTo(i2);
    }
}
public class Example_SortingComparatore
{
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap(new CustomSortingInteger());
        treeMap.put(80,"Tamil");
        treeMap.put(60,"English");
        treeMap.put(80,"Maths");
        treeMap.put(70,"Science");
        treeMap.put(70,"Social");
        System.out.println(treeMap);
    }
}
