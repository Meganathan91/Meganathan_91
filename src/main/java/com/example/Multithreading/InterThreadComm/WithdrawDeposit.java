package com.example.Multithreading.InterThreadComm;

class Sbi{
    double amount;
    Sbi(double balance)
    {
        this.amount=balance;
    }

    public synchronized void Withdraw(double Withdraw_amount)throws InterruptedException {
        System.out.println("This is Withdraw:"+Thread.currentThread().getId());
        System.out.println("Required Withdraw Amount :"+Withdraw_amount);
        while (Withdraw_amount>this.amount){
              System.out.println("Thread is waiting :Account Balance is Low");
                wait();
              //Thread.sleep(1000);
          }
        this.amount=this.amount-Withdraw_amount;
        System.out.println("After Withdraw Happening :"+this.amount);
    }

    public synchronized void Deposit(double Deposit_amount)throws InterruptedException {
        System.out.println("I am Depositing :"+Thread.currentThread().getId());
        this.amount=this.amount+Deposit_amount;
        System.out.println("I am notifying :"+Thread.currentThread().getId()+" : "+this.amount);
            notifyAll();
    }
    public synchronized void WithdrawSecond(double secondWithdraw)throws InterruptedException {
        System.out.println("secondWithdraw :"+Thread.currentThread().getId());
        System.out.println("secondWithdraw :"+secondWithdraw);
        while(secondWithdraw>this.amount){
            System.out.println("Thread is waiting :");
            wait();
            //Thread.sleep(1000);
        }
        this.amount=this.amount-secondWithdraw;
        System.out.println("Second Time Withdraw Happening :"+this.amount);
    }
}
public class WithdrawDeposit
{
    public static void main(String[] args)throws InterruptedException{
        Sbi mega=new Sbi(100000);
/* With out synchronization here am going to write all method and must need to give description.
And also need to write lot of join method in side run with synchronization. And it's not good practice
to write synchronization in run method.Here am going to define thread method and out side of run method.
 And achieve this using synchronization method. This is from Inter thread communication Mutual exclusive topic.*/
        Thread withdraw=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mega.Withdraw(20000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread withdrawSecond=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mega.WithdrawSecond(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread deposit=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mega.Deposit(20000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        withdraw.start();
        deposit.start();
        withdrawSecond.start();
        withdraw.join();
        deposit.join();
        withdrawSecond.join();
        System.out.println("Current Balance :"+mega.amount);
    }
}