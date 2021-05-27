package com.example.MethodInJava;

public class MethodOverloading
{
    String add()
    {
        return "No argument constructor, Nothing added";
    }
    static int add(int a,int b)
    {
        System.out.println("Parameterized constructor");
        int total=a+b;
        return total;
    }
    void add(String name,double price,int capacity)
    {
        System.out.println("Parameterized constructor based order");
        System.out.println(name+" "+price+" "+capacity);
    }
    public static void main(String[] args)
    {
        MethodOverloading overloading=new MethodOverloading();
        String word=overloading.add();
        System.out.println(word);

        int sum=add(12,56);
        System.out.println(sum);

        overloading.add("Audi",7000000,5);
    }
}
