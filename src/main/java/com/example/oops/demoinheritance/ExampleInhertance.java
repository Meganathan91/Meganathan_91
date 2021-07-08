package com.example.oops.demoinheritance;

public class ExampleInhertance extends Base
{
    public void child()
    {
        System.out.println("Child may depend Parent");
    }
    public static void main(String[] args) {
        ExampleInhertance inhert=new ExampleInhertance();
        inhert.parent();
        inhert.child();
    }

}
