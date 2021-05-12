package com.example.Multithreading.ThreadMethod;

public class ExampleThreadPriority extends Thread
{
    public void run()
    {
        System.out.println("current running thread is :"+Thread.currentThread().getName());
        System.out.println("current running thread is priority :"+Thread.currentThread().getPriority());
        System.out.println("current running thread is :"+Thread.currentThread().isDaemon());

    }
    public static void main(String[] args)
    {
        ExampleThreadPriority t1=new ExampleThreadPriority();
        ExampleThreadPriority t2=new ExampleThreadPriority();
        ExampleThreadPriority t3=new ExampleThreadPriority();
        ExampleThreadPriority t4=new ExampleThreadPriority();
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        t1.start();
        t4.start();
        t2.start();
    }
}
