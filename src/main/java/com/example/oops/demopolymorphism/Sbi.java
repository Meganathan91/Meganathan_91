package com.example.oops.demopolymorphism;

    public class Sbi extends Rbi
    {
        @Override
        public void interestRate()
        {
            System.out.println("SBI loan interest rate 6%");
        }
        public static void main(String[] args) {
            Rbi rbi=new Sbi();
            rbi.interestRate();

        }
    }

