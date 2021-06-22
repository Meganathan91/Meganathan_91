package com.example.VariablesDemo;

public class StaticVariableExample
{
    static String car="volvo";
    void display()
    {
        System.out.println(car);
    }
    public static void main(String[] args) {
        StaticVariableExample staticVariable=new StaticVariableExample();
        StaticVariableExample staticVariable2=new StaticVariableExample();
        //System.out.println("Without changing the value volvo :"+staticVariable.car);
        staticVariable.display();
        staticVariable2.car="innova";
        //System.out.println(" 1st volvo and now innova.car:"+staticVariable2.car);
        staticVariable.display();
    }
}
