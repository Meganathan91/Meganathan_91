package com.example.Multithreading;

public class ExampleWithOutThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        ExampleWithOutThread thread=new ExampleWithOutThread();
        ExampleWithOutThread threa=new ExampleWithOutThread();
        //Here showing thread exception same thread started twice.
        thread.start();
        //thread.start();
        //Here not showing thread exception reason we using normal run method not start method.
        //threa.run();//Compiler create separate stack.
        //threa.run();

    }

}
