package com.collection.Set;

import java.util.TreeSet;
class Comparator implements java.util.Comparator {

    @Override
    public int compare(Object obj1,Object obj2){
        Integer i1=(Integer) obj1;
        Integer i2=(Integer) obj2;

        return -i1.compareTo(i2);
    }
}
public class Example_ComparatorInteger
{
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<Integer>(new Comparator());
        treeSet.add(34);
        treeSet.add(56);
        treeSet.add(32);
        treeSet.add(78);
        treeSet.add(91);
        System.out.println(treeSet);

    }
}
