package com.example.Multithreading;

import com.example.Multithreading.ThreadMethod.Example_Name;

public class Example_NameMethos implements Runnable
{
       //Doubt other modifier not allowing here.
        @Override
        public void run()
        {
            for(int j=1;j<3;j++)
            {
                System.out.println(j);

            }
        }
        public static void main(String[] args)/*throws InterruptedException*/
        {
            com.example.Multithreading.ThreadMethod.Example_Name thread=new com.example.Multithreading.ThreadMethod.Example_Name();
            Thread t1=new Thread(thread);
            Thread t2=new Thread(thread);
            Thread t3=new Thread(thread);
            t1.start();//Here static error showing why?
            //Thread.sleep(1000);////Here static error not showing why?
            t2.start();
            //Thread.sleep(1000);
            t3.start();//Here static error showing why?
            //Thread.sleep(1000);////Here static error not showing why?


        }
    }


