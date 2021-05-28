package com.example.MethodInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Employee{
    String name;
    Integer salary;
}
public class ReturningDifferentType_Map
{
    static Map<Integer,String> getDetails()
    {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"hi");
       return map;
    }
    public static void main(String[] args)
    {
        Map<Integer,String> pair=getDetails();
        for(Map.Entry m:pair.entrySet()){
            System.out.println("Key :"+m.getKey()+"\n"+"Value :"+m.getValue());
        }
    }
}
