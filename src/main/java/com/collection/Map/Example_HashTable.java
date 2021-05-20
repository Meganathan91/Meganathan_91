package com.collection.Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example_HashTable
{
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht .put(1,"Red");
        ht .put(2,"Black");
        ht .put(3,"White");
        Hashtable<Integer,String> ht1=new Hashtable<Integer,String>();

        ht1 .put(4,"Blue");
        ht1 .put(5,"Orange");
        ht1 .put(6,"Yellow");
        System.out.println(""+ht);
        System.out.println(""+ht1);
        ht1.putAll(ht);
        Set t=ht1.entrySet();
        Iterator itr=t.iterator();
        while(itr.hasNext())
        {
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.print(" "+entry.getKey()+" "+entry.getValue());
        }

    }
}
