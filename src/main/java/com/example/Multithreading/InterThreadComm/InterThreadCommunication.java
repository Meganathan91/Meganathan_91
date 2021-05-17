package com.example.Multithreading.InterThreadComm;
class ThreadJoinOne extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<3;i++){
            System.out.println("t1:"+i);
        }
    }
}
class ThreadJoinTwo extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<3;i++){
            System.out.println("t2 :"+i);
        }
    }
}class ThreadJoinThree extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<3;i++){
            System.out.println("t3 :"+i);
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args)  throws InterruptedException
    {
        ThreadJoinOne t1 = new ThreadJoinOne();
        ThreadJoinTwo t2 = new ThreadJoinTwo();
        ThreadJoinThree t3 = new ThreadJoinThree();
        t1.start();
        t1.join();
        System.out.println(t1.getName()+""+t1.isAlive());
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
