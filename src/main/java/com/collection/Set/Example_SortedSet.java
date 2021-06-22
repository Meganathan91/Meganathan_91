package com.collection.Set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example_SortedSet
{
    public static void main(String[] args)
    {
        SortedSet<Integer> set=new TreeSet<Integer>();
        set.clear();
        set.add(20);
        set.add(30); //set.add(null); Here compare is going so null we can't able to compare with any thing so null pointer exception.
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(30);
        set.add(40);
        //set.add(null);
        set.add(50);
        set.add(60);
        System.out.println("Sortedset :"+set);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(40));
        System.out.println(set.tailSet(30));
        System.out.println(set.subSet(20,50));
        //System.out.println(set.comparator());
        System.out.println(set);
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }

    }
}
