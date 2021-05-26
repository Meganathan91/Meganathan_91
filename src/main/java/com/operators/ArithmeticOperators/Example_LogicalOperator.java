package com.operators.ArithmeticOperators;

import java.util.Scanner;

public class Example_LogicalOperator
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Using logical and :");
        String user=scanner.next();
        String pass=scanner.next();
        if(user.equals("Mega") && pass.equals("user"))
        {
            System.out.println("equals");
        }
        else if(user.equalsIgnoreCase("Mega") || pass.equals("user"))
        {
            System.out.println("equalsIgnoreCase");
        }
        else System.out.println("Finally else part is executed : "+!(10<5));


    }
}
