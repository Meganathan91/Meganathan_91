package com.collection.Set;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.HashSet;
import java.util.Iterator;
public class Example_HashSet
{
    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add(null);
        set.add(10);
        set.add("Safe");
        set.add(null);
        set.add("hi");
        set.add(null);
        set.add(10);
        set.add("hi");
        set.add("welcome");
        HashSet set1=new HashSet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext())
        {
            System.out.print(" "+iterator.next());
        }
    }
}
