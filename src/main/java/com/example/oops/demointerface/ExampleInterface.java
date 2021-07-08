package com.example.oops.demointerface;

public class ExampleInterface implements Volvo,Audi
{
    @Override
    public void priceDetail(double price)
    {
        System.out.println("We can buy those car soon "+price);
    }

    public static void main(String[] args)
    {
        Volvo v=new ExampleInterface();
        v.priceDetail(5000000);
    }
}
