package com.example.Constructor;

public class ConstructorCopyDemo
{
    int x;
    String word;
    int y;
    String word1;
    ConstructorCopyDemo()
    {
        System.out.println(x+" "+word);
    }
    ConstructorCopyDemo(int i, String name)
    {
        this.x=i;
        this.word=name;
        System.out.println(x+" "+word);
    }
    ConstructorCopyDemo(ConstructorCopyDemo demo)
    {
        y=demo.x;
        word1=demo.word;
        System.out.println("Copy Constructor :"+demo.x+" "+demo.word);
        System.out.println("Copy Constructor :"+y+" "+word1);
    }
    public static void main(String[] args) {
        ConstructorCopyDemo demo=new ConstructorCopyDemo();
        ConstructorCopyDemo demo1=new ConstructorCopyDemo(1,"Mega");
        ConstructorCopyDemo demo2=new ConstructorCopyDemo(demo1);
    }
}
