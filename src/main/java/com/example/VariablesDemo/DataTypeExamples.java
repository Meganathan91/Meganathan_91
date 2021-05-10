package com.example.VariablesDemo;

public class DataTypeExamples
{
    static int x;
    int a=10;
    String b;
    char d;
    float f;
    boolean bl;


void display(){
    a=20;
    System.out.println("int value :"+a);
    System.out.println("string value :"+b);
    System.out.println("char value :"+d);
}
    public static void main(String[] args) {
    DataTypeExamples examples=new DataTypeExamples();
    examples.display();

        System.out.println(x);
    }
}
