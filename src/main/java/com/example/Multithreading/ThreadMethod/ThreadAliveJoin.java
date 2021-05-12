package com.example.Multithreading.ThreadMethod;

public class ThreadAliveJoin extends Thread
{
    int count;
    public void run()
    {
        count++;
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(count);
    }

    public static void main(String[] args)throws InterruptedException
    {
        ThreadAliveJoin t1=new ThreadAliveJoin();
        ThreadAliveJoin t2=new ThreadAliveJoin();
        ThreadAliveJoin t3=new ThreadAliveJoin();
        t1.start();
        try
        {
            t1.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        t3.start();
        t2.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(t1.getName());
        t1.setName("Multithreading");
        System.out.println(t1.getName()+" Is "+t1.isAlive());
    }
}
