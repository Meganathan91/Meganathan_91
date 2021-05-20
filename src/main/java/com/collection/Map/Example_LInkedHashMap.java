package com.collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Example_LInkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hashMap=new LinkedHashMap<>();
        hashMap.put("Tamil",80);
        hashMap.put("English",70);
        hashMap.put("Math",85);
        hashMap.put("Science",70);
        hashMap.put("Social",85);
        hashMap.put("Practical",100);
        hashMap.put(null,50);// Here Null Key Need Use LinkedHashMap, Accepting Null Key.
        hashMap.put("Sub",null);
        System.out.println("Display all subject pairs(Key/Value) :"+hashMap);
        hashMap.put("English",67);
        System.out.println("After updated subject(English) :"+hashMap);
        System.out.println("After removing returning value :"+hashMap.remove("Practical"));
        System.out.println("Display based on insertion order of pairs(Key/Value) :"+hashMap);

    }
}
