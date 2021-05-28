package com.example.Constructor;
class SuperDemo
{
public SuperDemo()
{
    System.out.println("Parent class constructor");
}
}
public class ConstructorChaining
{
    public ConstructorChaining()
    {
        //super();
        System.out.println("no-arg constructor");
    }
    public static void main(String[] args)
    {
        SuperDemo demo=new SuperDemo();
        ConstructorChaining chaining = new ConstructorChaining();
    }

}
