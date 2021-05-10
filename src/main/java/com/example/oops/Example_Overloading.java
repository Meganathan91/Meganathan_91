package com.example.oops;

public class Example_Overloading
{
    void display(int sittingavailablity)
    {
        System.out.println("sittingavailablity :"+sittingavailablity);
    }
    void display(float carprice)
    {
        System.out.println("Price for car :"+carprice);
    }
    public static void main(String[] args) {
    Example_Overloading overloading=new Example_Overloading();
    overloading.display(5);
    overloading.display( 500000f);
    }

}
