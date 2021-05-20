package com.collection.Map;

import java.util.*;
public class Example_HashMap
{
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
        hashMap.put("Tamil",80);
        hashMap.put("English",70);
        hashMap.put("Math",85);
        hashMap.put("Science",70);
        hashMap.put("Social",85);
        hashMap.put("Practical",100);
        hashMap.put(null,50);// Here null Value is accepting, but null Key not accepting.
        hashMap.put("Sub",null);
        System.out.println("Display all subject pairs(Key/Value) :"+hashMap);
        hashMap.put("English",67);
        System.out.println("After updated subject(English) :"+hashMap);
        System.out.println("After removing returning value :"+hashMap.remove("Practical"));
        System.out.println("containsKey :"+hashMap.containsKey("Practical"));
        System.out.println("containsValue :"+hashMap.containsValue(85));
        System.out.println("All values :"+hashMap.values());
        Set s=hashMap.keySet();
        Iterator i=s.iterator();
        while (i.hasNext()){
            System.out.print(" "+i.next());
        }
        System.out.println();
        //Set sa=hashMap.entrySet();
        for(Map.Entry e:hashMap.entrySet()){
            System.out.print(" " +e.getKey()+" " +e.getValue());
        }
     }
}
