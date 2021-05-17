package com.collection.list;

import java.util.*;
public class BasicCollection
{
    public static void main(String[] args)
    {
        BasicCollection collection=new BasicCollection();
        System.out.println(" oby"+collection);
        try{
        int a[]=new int[4];
        a[0]=5;
        a[1]=10;
        a[2]=15;
        a[3]=20;
        /* a[5]=10; Here once we initialized the array size con't able to change
                  Ex: here am get a[5], but my array size(0-4) it is index based 0 t0 n. */
        int j=a.length;
        System.out.println(a[3]);}
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    /* To over come the problem collection came.

    */
         /* 1. Integer,String and object.
         Here generic is doing important role.
         2. Suppose here i want to add any element in Center place won't do.So we  */
        Collection<Object> list=new ArrayList<Object>();
        list.add(10);
        list.add('S');
        list.add("123.00");
        list.add("Welcome");
        list.add("Meganathan S");

        for(Object item:list){
            System.out.print(item + " ");
        }
        System.out.println(list.size());

        List<Object> listdemo=new ArrayList<Object>();
        listdemo.add(10);
        listdemo.add(20);
        listdemo.add("123.00");
        listdemo.add("Welcome");
        listdemo.add("Meganathan S");
        listdemo.set(1,30);
        //listdemo.set(6,"Praba");

        //listdemo.set(5,"Prab");
        /* Here am getting exception because already length is 5(0-6).
         Again 6 index am going to insert any value getting .ArrayIndexOutOfBoundsException */

        System.out.println("Collection using list(Because index supported here) :"+listdemo.size());
        for(Object listitem:listdemo){
            System.out.print(listitem + " ");
        }
    }


}
