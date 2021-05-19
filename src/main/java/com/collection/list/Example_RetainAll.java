package com.collection.list;

import java.util.ArrayList;

public class Example_RetainAll
{
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add('a');
        list.add("welcome");
        ArrayList list1=new ArrayList();
        list1.add(1);
        list1.add('a');
        list1.add("welcome");
        list1.add(2);
        list1.add('g');
        list1.add("hi");
        System.out.println(list1.retainAll(list));
        //System.out.print(list);
        System.out.print("After retailAll object in list1 :"+list1);



    }
}
