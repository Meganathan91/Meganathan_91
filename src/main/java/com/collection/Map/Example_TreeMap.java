package com.collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class Example_TreeMap
{
    static TreeMap<String,Integer> treeMap;
    static void create(){
        treeMap=new TreeMap<String,Integer>();
    }
    static void insert(){
        treeMap.put("Tamil",80);
        treeMap.put("English",60);
        treeMap.put("Maths",80);
        treeMap.put("Science",70);
        treeMap.put("Social",70);
        System.out.println("Inserting pairs in to TreeMap :"+treeMap);
    }
    static void searchMark(String math ){
        System.out.println("Check Subject, availability (Y/N) :"+""+treeMap.containsKey(math));
        if(treeMap.containsKey(math)){
            Integer mark=treeMap.get(math);
            System.out.println("Maths Mark :"+mark);
        }
    }
    static void displaySubject(String subject){
        System.out.println("Maths Subject Available (Y/N) :"+treeMap.containsKey(subject));
    }
    static  void subjectDetails(){
        for(Map.Entry detail: treeMap.entrySet())
        {
            System.out.println(" "+detail.getKey()+" "+detail.getValue());
        }
    }
    public static void main(String[] args) {

        create();
        insert();
        searchMark("Maths");
        displaySubject("Math"); // Here am passed key invalid so am getting false.
        subjectDetails();
    }
}
