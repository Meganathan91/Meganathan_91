package com.collection.list;
import java.util.*;
public class Example_ArrayList
{
    public static void main(String[] args)
    {
        Collection<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<3;i++){
            arr.add(i);
        }
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(((ArrayList<Integer>) arr).get(i) + " ");
        }
        System.out.println();
        List list=new ArrayList();
        list.add(10);
        list.add(20);
        list.add('s');
        list.add("Raja");
        list.add(false);
        System.out.println("List :"+list);
        System.out.println("This is return whether add or not (t/f):"+list.add(20)); // This is return t/f object added or not.
        System.out.println("After adding new object :"+list);
        System.out.println("Size of list :"+list.size());
        System.out.println("Get object from 2 index :"+list.get(2));
        list.add(2,"Praba");
        System.out.println(list);// Here in 2th position i am added Praba.
        list.set(2,"hi");
        System.out.println(list);
        System.out.println("Displaying object (hi) index :"+list.indexOf("hi"));
        System.out.println("The given object in or not :"+list.contains("Praba")); // Here am checking the given object in or not return (t/f).
        System.out.println("List :"+list);
        list.remove(3); // This is remove given position.
        for (int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
        System.out.println();
        ListIterator iterator= list.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("Final array list :"+list);
        List list2=new ArrayList();
        list2.add(0,"Welcome");
        list2.add("Mumbai");
        System.out.println(list2);
        List list3=new ArrayList();
        list3.add("Ariyalur");
        list3.add("udpm");
        list3.add("jkm");
        System.out.println(list3);
        list3.addAll(list2);
        list2.addAll(1,list);
        System.out.println("list3 :"+list3);
        System.out.println("List :"+list.addAll(4,list3));
        System.out.println(list);
        System.out.println(list2.containsAll(list));
        List list1=list.subList(1,9);
        System.out.println(list1);
        list1.add("Mumbai");
        System.out.println("indexOf :"+list1.indexOf("Mumbai"));
        System.out.println("lastIndexOf :"+list1.lastIndexOf("Mumbai"));
        System.out.print(list1+" ");
        list.remove(9);
        list.remove(list1);
        list.removeAll(list);
        List list4=new ArrayList();
        list4.add("Pen");
        list4.add("Pencil");
        list4.add("Paper");
        list4.add("Book");
        List list5=new ArrayList();
        list5.add("Pen");
        list5.add("Book");
        list5.add("Box");
        System.out.print("Retain all elements :"+list5.retainAll(list4));

        System.out.println("Retails :"+list.retainAll(list3));
        System.out.print("To string method :"+list.toArray());
        ListIterator iterator1=list.listIterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
    }
}
