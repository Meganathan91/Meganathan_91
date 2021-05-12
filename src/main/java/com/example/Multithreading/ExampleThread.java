package com.example.Multithreading;

import com.sun.java_cup.internal.runtime.Symbol;

import java.util.Scanner;

public class ExampleThread extends Thread
{
    int count=0;
    public void run()
    {
        count++;
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int amount=scanner.nextInt();
        ExampleThread thread=new ExampleThread();
        Scanner scanne=new Scanner(System.in);
        int amoun=scanner.nextInt();
        ExampleThread threa=new ExampleThread();
        //System.out.println("Thread name :"+thread.currentThread());
        thread.start();
        threa.start();

    }

}
