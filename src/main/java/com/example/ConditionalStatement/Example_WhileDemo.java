package com.example.ConditionalStatement;

import java.util.Arrays;
import java.util.Scanner;

public class Example_WhileDemo
{


    public static void main(String[] args)
    {
        Example_WhileDemo demo=new Example_WhileDemo();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give the number");
        int number=scanner.nextInt();
        int[] n=new int[number];
        System.out.println("Length of the array :"+n.length);
        int total=0;
            while( number<=n.length)
            {
                total=total+number;
                System.out.println("Give the number");
                number=scanner.nextInt();
                number++;
            }
        System.out.println(total);
            scanner.close();
        }
}
