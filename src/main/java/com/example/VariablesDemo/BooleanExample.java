package com.example.VariablesDemo;

public class BooleanExample
{
    boolean a=false;
    boolean b=true;
    int i=10;
    int j=20;
    void display()
    {
        if (i>j) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        BooleanExample example=new BooleanExample();
        example.display();
    }
}
