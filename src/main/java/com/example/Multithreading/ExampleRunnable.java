package com.example.Multithreading;

import java.util.Scanner;

public class ExampleRunnable implements Runnable
{
    int count=0;
    @Override
    public void run()
    {
        count++;
        System.out.println(count);
        /*try
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }*/
        }
    public static void main(String[] args)throws InterruptedException
    {
        ExampleRunnable multithreading= new ExampleRunnable();//Runnable stack memory created only onr time and shared with all created thread object
        Thread thread=new Thread(multithreading);
        Thread thread1=new Thread(multithreading);
        Thread thread3=new Thread(multithreading);
        thread.start();
        /*Scanner scanner=new Scanner(System.in);
        int amount=scanner.nextInt();
        for(int i=0;i<5;i++)
        {
            System.out.println(amount);
        }*/
        //Thread.sleep(1000);
        /*try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }*/
        thread1.start();
        thread3.start();

    }
}
