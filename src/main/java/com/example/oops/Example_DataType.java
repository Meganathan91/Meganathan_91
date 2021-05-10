package com.example.oops;

public class Example_DataType
{
    void display()
    {
        int i=10;
        int x= (int) 4534.4f;
        byte b=(byte)324.98f;
        float f=456;
        double d=532345.45f;
        System.out.println("integer type :"+i);
        System.out.println("integer type but casted :"+x);
        System.out.println("integer type but casted :"+b);
        System.out.println("integer type but casted :"+d);

    }
    public static void main(String[] args)
    {
        Example_DataType dataType=new Example_DataType();
        dataType.display();
    }
}
