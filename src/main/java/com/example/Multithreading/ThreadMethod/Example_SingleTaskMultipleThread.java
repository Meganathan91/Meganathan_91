package com.example.Multithreading.ThreadMethod;

public class Example_SingleTaskMultipleThread extends Thread
{

    @Override
    public void run()
    {
        System.out.println("First task");
    }
    public static void main(String[] args)
    {
        Example_SingleTaskMultipleThread thread=new Example_SingleTaskMultipleThread();
        thread.start();
        Example_SingleTaskMultipleThread thread1=new Example_SingleTaskMultipleThread();
        thread1.start();
    }
}
