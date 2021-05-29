package com.example.Constructor;
public class Example_Constructor
{
    int i;
    Integer j;
    String name1=null;
    String name;
    String hi;
     private Example_Constructor(int j)
    {
        this.i=j;
        System.out.println("Constructor initial argument :"+i);
    }

        protected Example_Constructor(String name)
    {
        this(10);
        this.name=name;
        System.out.println("No Argument Constructor :"+name);
    }
     public Example_Constructor()
    {
        this("welcome");
        this.i=i;
        System.out.println("Constructor after passing value with argument :"+i);
        System.out.println("Constructor after passing value with argument :"+j);

    }
        public static void main(String[] args)
    {
        //display();
        Example_Constructor exampleConstruct=new Example_Constructor();
        Example_Constructor exampleConstructor=new Example_Constructor(10);
    }
}
