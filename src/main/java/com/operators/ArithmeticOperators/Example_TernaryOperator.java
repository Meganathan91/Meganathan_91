package com.operators.ArithmeticOperators;

import java.util.Scanner;

public class Example_TernaryOperator
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Using Ternary Operator :");
        String user=scanner.next();
        String pass=scanner.next();
        boolean result=(user.equals("Mega") && pass.equals("user") ? user.equalsIgnoreCase("Mega") || pass.equals("user") :  !(10>5));
        System.out.println(result);
    }
} 
