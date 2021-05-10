package com.example.ExampleKeywords;

public class Example_ThisKeyword
{
    int x=10;
    Example_ThisKeyword()
    {
        System.out.println("DefaultConstructor");
    }
    Example_ThisKeyword(int i)
    {
        this();
        System.out.println("ThisKeyword");
    }
    void exampleThisKeyword()
    {
        System.out.println("exampleThisKeyword");
    }
    void exampleThisDemo()
    {
        this.exampleThisKeyword();
        System.out.println(this.x);
    }
   public static void main(String[] args)
    {
        Example_ThisKeyword thisKeyword=new Example_ThisKeyword(10);
        thisKeyword.exampleThisDemo();
    }
}
