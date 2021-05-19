package com.collection.Set;
import java.util.*;
/* Index not supported in set interface and sub interface as well as implemented classes. */
public class Example_LinkedHashSet
{
    public static void main(String[] args) {
        LinkedHashSet<Object> hashSet=new LinkedHashSet<Object>();
        hashSet.add("welcome");
        hashSet.clear();
        hashSet.add(100);
        System.out.println(hashSet);  // [100]
        hashSet.add(null);
        hashSet.add(10);
        hashSet.add('s');
        hashSet.add("Raja");
        hashSet.add("Raja");
        hashSet.add('s');
        hashSet.add(false);
        hashSet.add(null);
        hashSet.add(10);
        System.out.println("LinkedHashSet  :"+hashSet); // [100,10,s,Raja,false,null]
        System.out.println("This is return whether add or not (t/f):"+hashSet.add(20)); // This is return t/f object added or not.
        System.out.println("After adding new object :"+hashSet); // [100,10,s,Raja,false,null,20]
        System.out.println("Size of list :"+hashSet.size()); // 7
        //hashSet.add(2,"Praba"); Index not supported in set.
        Set hashSet1=new LinkedHashSet();
        hashSet1.add("Raja");
        hashSet1.add("10");
        hashSet1.add("Ravi");
        hashSet1.add("hi");
        System.out.println("hashSet1 :"+hashSet1);
        System.out.println("The given object in or not :"+hashSet1.contains("Raja")); // Here am checking the given object in or not return (t/f).
        hashSet1.remove("10");
        System.out.print("After removing 3rd index :"+hashSet1);// [Raja,Raja,hi]
        Iterator iter= hashSet.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.println();
        System.out.println("Final array list :"+hashSet);
        Set hashSet2=new LinkedHashSet();
        hashSet2.add("Mumbai");
        hashSet2.contains("Welcome");
        hashSet2.remove("1");
        System.out.println(hashSet2);
        Set hashSet3=new LinkedHashSet();
        hashSet3.add("Ariyalur");
        hashSet3.add("udpm");
        hashSet3.add("jkm");
        hashSet3.add("Ariyalur");
        hashSet3.add("udpm");
        hashSet3.add("jkm");
        System.out.println(hashSet3);
        hashSet.addAll(hashSet3);
        System.out.println(hashSet3);
        System.out.println(hashSet3.containsAll(hashSet3));
        System.out.println(" HashSet3 :"+hashSet3);
        hashSet.add("Mumbai");
        System.out.println(hashSet+" ");
        System.out.println("LinkedHashSet :"+hashSet);
        Set hashSet4=new LinkedHashSet();
        hashSet4.add("Pen");
        hashSet4.add("Pencil");
        hashSet4.add("Paper");
        hashSet4.add("Book");
        System.out.println("hashSet2 :"+hashSet4);
        Set hashSet5=new LinkedHashSet();
        hashSet5.add("Pen");
        hashSet5.add("Book");
        hashSet5.add("Box");
        System.out.print("Retain all elements :"+hashSet4.retainAll(hashSet5));
        System.out.println(" HashSet4 :"+hashSet4); //[Pen, Book]
    Iterator iterator1=hashSet.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
    }
}
