package com.example.ExampleKeywords;

public class Example_Static
{
    static int count=0;
    Example_Static()
    {
        count++;
        System.out.println(count);
    }
    static void display()
    {
        System.out.println("static method level");
    }
    static
    {
        System.out.println("I am first");
    }
    void staticExample()
    {
        System.out.println(count);

    }
    public static void main(String[] args)
    {
        Example_Static example=new Example_Static();
        Example_Static exampl=new Example_Static();
        Example_Static examp=new Example_Static();
        System.out.println(count);
        example.staticExample();
        display();
    }
}
