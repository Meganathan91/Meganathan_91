package com.collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Example_DefaultNaturalSort
{
    public static void main(String[] args) {
        TreeSet set=new TreeSet();
        set.add('A');
        set.add('F');   /* JVM internally call F.compareTo(A) method A: old value,
                           F: Newly coming value. Every new element compare with A. */
        set.add('R');
        set.add('U');
        set.add('t');
        //set.add(new StringBuffer("A")); // Here RE: ClassCastException.
        System.out.println(set);
        /*Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }*/
    }
}
