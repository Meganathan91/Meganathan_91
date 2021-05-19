package com.collection.Set;

import java.util.TreeSet;

public class Example_TreeSet
{
    public static void main(String[] args) {

        TreeSet<String> treeSet=new TreeSet<String>(); // Default natural Sorting order empty TreeSet().
        treeSet.add("hi");
        treeSet.add("welcome");
        treeSet.add("selflearn");
        treeSet.add("lucky");
                                /* Treeset.add(10); char not allowed  Here we getting class cast Exception, because integer not able with compare string.
                                treeSet.add(null);  Null pointer exception. Not able to compare with any thing.
                                Treeset Homogeneous only allowed for compare.     */
        treeSet.add("need");
        treeSet.add("lucky");
        treeSet.add("need");
        treeSet.add("A");
        treeSet.add("x");
        treeSet.add("a");
        /*
        treeSet.add(new StringBuffer("Hi")); Here Comparable interface accept only string.
                                                    Otherwise class cast Exception.
        treeSet.add(new StringBuffer("Hello"));
        treeSet.add(new StringBuffer("How"));
        treeSet.add(new StringBuffer("You"));*/

        System.out.println(treeSet);



    }
}
