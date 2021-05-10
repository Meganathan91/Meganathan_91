package com.example.VariablesDemo;

public class StaticVariableExample
{
    //String car="volvo";
    static String car="volvo";
    int a=10;
    void display()
    {
        //car="tyota";
        System.out.println("volvo:"+car);
    }
    public static void main(String[] args) {
        StaticVariableExample volvo=new StaticVariableExample();
        StaticVariableExample innova=new StaticVariableExample();
        StaticVariableExample toyato=new StaticVariableExample();
        System.out.println(volvo.a);
        //System.out.println("Without changing the value volvo :"+volvo.car);
        volvo.display();
        innova.car="innova";
        //System.out.println(" 1st volvo and now innova.car:"+innova.car);
        volvo.display();
    }
}
