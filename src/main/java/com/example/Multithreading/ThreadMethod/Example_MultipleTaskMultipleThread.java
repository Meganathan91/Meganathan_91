package com.example.Multithreading.ThreadMethod;
class One extends Thread
{
    public void run()
    {
        System.out.println("I am one");
    }
}
class Two extends Thread
{
    public void run()
    {
        System.out.println("I am two");
    }
}
public class Example_MultipleTaskMultipleThread
{
    public static void main(String[] args)
    {
        One one=new One();
        one.run();
        Two two=new Two();
        two.run();

    }
}
