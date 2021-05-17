package com.example.Multithreading.synchronization;
class MyThreadone extends Thread
{
    Sample s;
    MyThreadone(Sample s1)
    {
        this.s=s1;
    }
    public void run()
    {
        s.compute(5);
    }
}
class MyThreadtwo extends Thread
{
    Sample s;
    MyThreadtwo(Sample s2)
    {
        this.s=s2;
    }
    public void run()
    {
        s.compute(100);
    }
}

class Sample{
    public synchronized void compute(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}
public class Example_SynchronizedMethod {

    public static void main(String[] args) {
        Sample s=new Sample();
        MyThreadone one = new MyThreadone(s);
        MyThreadtwo two=new MyThreadtwo(s);
        one.start();
        two.start();
        try{
            one.join();
            two.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
