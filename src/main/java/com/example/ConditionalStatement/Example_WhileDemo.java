package com.example.ConditionalStatement;

import java.util.Scanner;

public class Example_WhileDemo
{
    void looping()
    {
        int i=0,j=5;
        while(j>i)
        {
            i++;
            System.out.println(i);
        }
        System.out.println("Condition is false");
    }

    public static void main(String[] args)
    {
        Example_WhileDemo demo=new Example_WhileDemo();
        //demo.looping();
        int i=0;
        int total=0;
        Scanner scanner=new Scanner(System.in);
        int mark=scanner.nextInt();

        for(i=1;i<5;i++)
        {
             total=total+mark;
            i++;
        }
        System.out.println(total);
        /*int i=0,j=5;
        do
        {
            i++;
            System.out.println(i);
        }while(j>i);*/
    }
}
