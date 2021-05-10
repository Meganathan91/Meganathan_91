package com.example.oops;
class Base
{
void parent()
{
    System.out.println("He is not depend son");
}
}
public class Example_Inhertance extends Base
{
    void child()
    {
        System.out.println("Child may depend Parent");
    }
    public static void main(String[] args) {
        Example_Inhertance example_inhert=new Example_Inhertance();
        example_inhert.parent();
        example_inhert.child();
    }
}
