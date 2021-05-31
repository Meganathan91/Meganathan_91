package com.example.Multithreading;
public class ExampleThread extends Thread
{
    int count=0;
    public void run()
    {
        count++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        ExampleThread t1=new ExampleThread();
        ExampleThread t2=new ExampleThread();
        ExampleThread t3=new ExampleThread();
        System.out.println("Thread name :"+Thread.currentThread());
        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
