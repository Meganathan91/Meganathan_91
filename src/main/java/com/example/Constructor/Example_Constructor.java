package com.example.Constructor;

public class Example_Constructor
{
    int i;
    String name;
    String hi;

     private Example_Constructor(int i)
    {
        this.i=i;
        System.out.println("Constructor with argument :"+i);
    }

   protected Example_Constructor(String name)
    {
        this.name=name;
        System.out.println("No Argument Constructor :"+name);
    }
     public Example_Constructor()
    {
        this.i=i;
        System.out.println("Constructor with argument :"+i);
    }


    /*static void display()
    {
        System.out.println(name);
    }*/
    /*Example_Constructor()
    {
        this(30);
        System.out.println(" constructor :"+i);
    }*/


    public static void main(String[] args)
    {
        //display();
        Example_Constructor exampleConstruct=new Example_Constructor();
        Example_Constructor exampleConstructor=new Example_Constructor(19);
    }
}
