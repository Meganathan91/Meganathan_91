package com.collection.Set;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Example_Queue {
    public static void main(String[] args) {
        PriorityQueue queue=new PriorityQueue();
        queue.add("hi");
        System.out.println(queue.peek());// This is not remove any element, just return, not available return null
        System.out.println(queue.element());//Not remove, Queue is empty RE: NoSuchElementException
        System.out.println(queue);// Default Natural Soring Order
        System.out.println(queue.poll());//This is Remove header element of the queue.
        System.out.println(queue);
    }

}
