package com.collection.list;

import java.util.*;
public class Example_LinkedList
{
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<Integer>();
        for(int i=0;i<5;i++)
        {
            vector.add(i);
        }
        System.out.println(vector);
        vector.remove(4);
        System.out.println(vector);
        for(int i=0;i<vector.size();i++){
            //System.out.print(vector.get(i) +" ");
        }
        LinkedList linkedList=new LinkedList();
        linkedList.add("Welcome");
        linkedList.addFirst("Before");
        linkedList.addLast("After");
        linkedList.addFirst("First");
        linkedList.addLast("Last");
        System.out.println("LinkedList :"+linkedList);
        System.out.print(linkedList.poll());
        System.out.println("After poll  :"+linkedList);
        linkedList.pollFirst();
        linkedList.pollLast();
        System.out.println("LinkedList :"+linkedList);
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println("LinkedList :"+linkedList);
        linkedList.offer("J");
        linkedList.offerFirst("A");
        linkedList.offerFirst("B");
        linkedList.offerFirst("C");
        linkedList.offerFirst("A");
        linkedList.offerFirst("D"); //Here in offer first what element we added that is in 1st element.
        linkedList.offerLast("X");
        linkedList.offerLast("Y");
        linkedList.offerLast("Z");
        linkedList.offer("k");
        System.out.println("LinkedList :"+linkedList);
        List ll=linkedList.subList(1,5);
        System.out.print(ll);
        List l1= (List) linkedList.clone();
        linkedList.clear();
        System.out.println(l1);
        linkedList.removeAll(ll);
    }
}
