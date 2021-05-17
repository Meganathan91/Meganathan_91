package com.collection.list;

import java.util.Iterator;
import java.util.Stack;

public class Example_Stack
{
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        stack.push("Time");
        stack.push("For");
        stack.push("Learn");
        stack.push("!!!");
        Iterator iterator=stack.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        stack.pop();
        iterator=stack.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

    }
}
