package com.example.Multithreading;
public class ExampleRunnable implements Runnable
{
    int count=0;
    @Override
    public void run()
    {
        try
        {
            count++;
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        ExampleRunnable multithreading= new ExampleRunnable();//Runnable stack memory created only onr time and shared with all created thread object
        Thread t1=new Thread(multithreading);
        Thread t2=new Thread(multithreading);
        Thread t3=new Thread(multithreading);
        t1.start();
        t2.start();
        t3.start();
        try
        {
        t1.join();
        t2.join();
        t3.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
