package com.example.oops;

import java.util.Scanner;

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
        //dataType.display();
        int no;
        int i=1;
        int total=0;
        System.out.print("Enter the no :");
        Scanner scanner=new Scanner(System.in);
        no=scanner.nextInt();
        while(i<=5){
            total=total+no;
            i++;
        }
        System.out.println("Total :"+total);



}}
