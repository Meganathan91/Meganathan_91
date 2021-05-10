package com.example.oops;

public class SBI extends RBI
{
    @Override
    void interestRate()
    {
        System.out.println("SBI loan interest rate 6%");
    }
    public static void main(String[] args) {
        SBI sbi=new SBI();
        //sbi.interestRate();
        RBI rbi=new SBI();
        rbi.interestRate();
        RBI rbi1=new RBI();
        rbi1.interestRate();

    }
}
