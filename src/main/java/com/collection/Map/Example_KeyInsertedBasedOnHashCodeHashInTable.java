package com.collection.Map;

import java.util.Hashtable;
import java.util.Map;

public class Example_KeyInsertedBasedOnHashCodeHashInTable
{
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>(4);
        ht .put(1,"Blue");
        ht .put(2,"Orange");
        ht .put(3,"Yellow");

        //ht.put(2,null);//NPE
        //ht.put(null,null);
        System.out.println("InitialCapacity 4:"+ht);
        Hashtable<Integer,String> ht1=new Hashtable<Integer,String>();
        ht1 .put(1,"one");
        ht1 .put(2,"two");
        ht1 .put(3,"thee");
        System.out.println("InitialCapacity 2: "+ht1);

        Hashtable<Integer,String> ht2=new Hashtable<Integer,String>(ht1);
        ht2 .put(4,"four");
        ht2 .put(5,"five");
        ht2 .put(6,"six");
        System.out.println("InitialCapacity 2: "+ht2);

        Hashtable<String,Integer> ht3=new Hashtable<String,Integer>();
        ht3 .put("Ram",20);
        ht3 .put("Ravi",30);
        ht3 .put("Raja",50);
        System.out.println("Size of ht3 :"+ht3.size());
        if(ht3.containsKey("Ram")){
           Integer i=ht3.get("Ram");
            System.out.println("Ram Value is(20) :"+i);

            Hashtable<String,Integer> ht4=new Hashtable<String,Integer>();
            ht4 .put("Ram",20);
            ht4 .put("Ravi",30);
            ht4 .put("Raja",50);
            System.out.println("InitialMap : "+ht4);
            ht4.put("Ram",100);
            if(ht4.containsKey("Ram")){
                Integer i1=ht4.get("Ram");
                System.out.println("Ram updated value is(100) :"+i1);
           }
            System.out.println("After updated pair  :"+ht4);
            ht4.remove("Ram");
            System.out.println("After removed pair  :"+ht4);

            Hashtable<String,Integer> ht5=new Hashtable<String,Integer>();
            ht5 .put("Ram",20);
            ht5 .put("Ravi",30);
            ht5 .put("Raja",50);
            for(Map.Entry<String,Integer> pairvalues:ht5.entrySet()){
                System.out.print(pairvalues.getKey()+"  "+pairvalues.getValue()+"  ");
            }
        }
}}
