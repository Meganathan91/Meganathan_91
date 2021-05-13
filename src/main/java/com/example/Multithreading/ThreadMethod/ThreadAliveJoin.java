package com.example.Multithreading.ThreadMethod;
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
public class ThreadAliveJoin {
    public static void main(String[] args)throws InterruptedException {
        ThreadJoinOne t1 = new ThreadJoinOne();
        ThreadJoinTwo t2 = new ThreadJoinTwo();
        ThreadJoinThree t3 = new ThreadJoinThree();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(t1.getName());
        t1.setName("Multithreading");
        System.out.println(t1.getName() + " Is " + t1.isAlive());

    }}
