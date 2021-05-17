package com.example.ConditionalStatement;

import java.util.Arrays;
import java.util.Scanner;

public class Example_WhileDemo
{


    public static void main(String[] args)
    {
        Example_WhileDemo demo=new Example_WhileDemo();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Give the number");
        int number=scanner.nextInt();
        int[] n=new int[number];
        int k=n.length;
        System.out.println("Length of the array :"+n.length);
        int total=0;
        int m=0;
            while( m<=k)
            {
                int num=scanner.nextInt();
                System.out.println("Give the number :"+num);
                total=total+num;
                m++;
            }
        System.out.println(total);
            scanner.close();
        }
}
