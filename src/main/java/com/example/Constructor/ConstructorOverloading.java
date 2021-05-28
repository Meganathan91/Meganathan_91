package com.example.Constructor;

public class ConstructorOverloading
{
    int x;
    int y;
    String name;
    double salary;
    ConstructorOverloading()
    {
        System.out.println("non-arg constructor");
    }
    ConstructorOverloading(int i)
    {
        this.x=i;
        System.out.println(x);
    }
    ConstructorOverloading(int i,String word,double money)
    {
        this.y=i;
        this.name=word;
        this.salary=money;
        System.out.println( y+" "+name+" "+salary);
    }

    public static void main(String[] args)
    {
        ConstructorOverloading overloading=new ConstructorOverloading();
        ConstructorOverloading overload=new ConstructorOverloading(10);
        ConstructorOverloading over=new ConstructorOverloading(1,"Praba",20000);
    }
}
