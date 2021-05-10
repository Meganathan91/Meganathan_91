package com.example.oops;
class Parent
{
    void display()
    {

    }
}
class GParent
{
    void display()
    {
        System.out.println("Gparent");
    }
}
public class Example_MultiInhert extends GParent
{
    public static void main(String[] args) {
        Example_MultiInhert multiInhert=new Example_MultiInhert();
        multiInhert.display();

    }
}
