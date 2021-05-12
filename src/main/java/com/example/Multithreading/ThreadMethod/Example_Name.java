package com.example.Multithreading.ThreadMethod;

public class Example_Name extends Thread
{
    int count=0;
    //Doubt other modifier not allowing here.
    @Override
    public void run()
    {
       count++;
        System.out.println(count);
        System.out.println(Thread.currentThread().getName());

    }
    public static void main(String[] args)throws InterruptedException
    {
        //Example_Name thread=new Example_Name();
        Example_Name t1=new Example_Name();
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);
        System.out.println("Current thread name : "+t1.getName());
        Example_Name t2=new Example_Name();
        Example_Name t3=new Example_Name();
        t1.start();//Here static error showing why?
        Thread.sleep(1000);////Here static error not showing why?
        t2.start();
        Thread.sleep(1000);
        t3.start();//Here static error showing why?
        //Thread.sleep(1000);////Here static error not showing why?


    }
}
