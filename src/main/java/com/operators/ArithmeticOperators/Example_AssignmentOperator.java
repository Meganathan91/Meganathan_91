package com.operators.ArithmeticOperators;

import java.util.Scanner;

public class Example_AssignmentOperator
{
     int num1=0; int num2=0;
     Scanner scanner=new Scanner(System.in);
     void assignmentOperator()
    {
        for(int i=1;i<2;i++)
        {
            System.out.println("Enter two number :");
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            num1+=num2;
            System.out.println("Addition :"+num1);
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            num1-=num2;
            System.out.println("Subtraction :"+num1);
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            num1*=num2;
            System.out.println("Multiplication :"+num1);
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            num1/=num2;
            System.out.println("Division :"+num1);
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            num1%=num2;
            System.out.println("Modules :"+num1);
        }
    }
    public static void main(String[] args)
        {
        Example_AssignmentOperator operator=new Example_AssignmentOperator();
        operator.assignmentOperator();
        }
}
