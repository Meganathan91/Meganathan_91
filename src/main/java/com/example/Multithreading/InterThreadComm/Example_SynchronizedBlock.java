package com.example.Multithreading.InterThreadComm;
public class Example_SynchronizedBlock extends Thread
{
    int t=0;
    public void run()
    {
        synchronized (this)
        {
            for (int i=1;i<4;i++)
            {
                t=t+i;
                try{
                   Thread.sleep(10000);
                }
                catch (InterruptedException e){
                   e.printStackTrace();
                }
                this.notifyAll();
                System.out.println(i);
            }
        }}
    public static void main(String[] args)throws InterruptedException
    {
        Example_SynchronizedBlock synchronizedBlock=new Example_SynchronizedBlock();
        Example_SynchronizedBlock syn=new Example_SynchronizedBlock();
        synchronizedBlock.start();
        //synchronizedBlock.join();
        syn.start();
        synchronized (synchronizedBlock)
        {
            System.out.println("Main Thread");
            synchronizedBlock.wait(10000000);
            System.out.println("Main Thread got notified");
            System.out.println(synchronizedBlock.t);
            // After releasing current object lock then only we access t value.
        }
    }
}
