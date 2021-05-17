package com.collection.list;

import java.util.Vector;

public class Example_Vector {
    public static void main(String[] args) {
        Vector<Object> vector=new Vector<Object>();
        for(int i=0;i<5;i++){
            vector.add(i);
        }
        System.out.println(vector);
        vector.remove(3);
        System.out.println(vector);
        for(int i=0;i<vector.size();i++){
            System.out.print(vector.get(i)+ " ");
            System.out.println(vector.capacity());

    }
}}

