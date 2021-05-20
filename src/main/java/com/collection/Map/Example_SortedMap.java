package com.collection.Map;

import java.util.TreeMap;

public class Example_SortedMap
{
    static void naturalSortingOrderString(){
        TreeMap<String,Integer> treeMap=new TreeMap<String,Integer>();
        treeMap.put("Tamil",80);
        treeMap.put("English",60);
        treeMap.put("Maths",80);
        treeMap.put("Science",70);
        treeMap.put("Social",70);
        System.out.println("defaultNaturalSortingOrder String :"+treeMap);
    }
    static void naturalSortingOrderInteger()
    {
        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
        treeMap.put(81,"Tamil");
        treeMap.put(79,"English");
        treeMap.put(88,"Maths");
        treeMap.put(83,"Science");
        treeMap.put(69,"Social");
        System.out.println("defaultNaturalSortingOrder Integer :"+treeMap);
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.headMap(88));
        System.out.println(treeMap.tailMap(83));
        //System.out.println(treeMap.subMap(79, 69));
    }
    public static void main(String[] args)
    {
        //Default natural Sorting Order: String Alphabitical order.
        naturalSortingOrderString();
        //Default natural Sorting Order: Integer Ascending order.
        naturalSortingOrderInteger();
        //SortingUsingComparator
    }
}
