package com.example.Constructor;

public class Example_Constructor
{
    int i;

    Example_Constructor(int i)
    {
        this.i=i;
        System.out.println("Constructor with no argument :"+i);
    }

    public Example_Constructor()
    {

        System.out.println("No Argument Constructor :"+i);

    }
    public static void main(String[] args)
    {
        Example_Constructor exampleConstruct=new Example_Constructor();
        Example_Constructor exampleConstructor=new Example_Constructor(19);

    }
}
