package com.example.ExampleKeywords;
class Demo
{
    int j;
    Demo() //In constructor body at the first line super or this only allowed
    {
        System.out.println("I am from PARENT class constructor using child class super keyword :"+j);
    }

    void parentMethod()
    {
        System.out.println("I am from PARENT class as method child class super keyword");
    }

    public static void main(String[] args) {
        Demo demo=new Demo();
    }
}

class Example_Super extends Demo
{
    Example_Super(int a)
    {
        //System.out.println();
        super();
        System.out.println("I am from local :"+a);
        System.out.println("Am from PARENT class as method :"+super.j);
    }
    void childMethod()
    {
        super.parentMethod();
        System.out.println("I am from Child class method :"+super.j);
    }

    public static void main(String[] args)
    {
        Example_Super example_super=new Example_Super(5);
        example_super.childMethod();
    }
}
