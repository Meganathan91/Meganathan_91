package com.operators.ArithmeticOperators;

import java.util.Scanner;

public class Example_ArithmeticOperators
{
    int sum=0;int sub=0;int div=0; int mul=0;
    int num1=0; int num2=0;
    int total=0;
    Scanner scanner=new Scanner(System.in);
    void operation()
    {
        System.out.println("Enter two number :");
        for(int i=1;i<=2;i++)
        {
            int num1=scanner.nextInt();
            sum+=num1;
        }            System.out.println("Addition :"+sum);


        System.out.println("Enter two number :");
        for(int i=1;i<=1;i++)
        {
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();

            sub=num1-num2;
        }
        System.out.println("Subtraction :"+sub);

        System.out.println("Enter two number :");
        for(int i=1;i<=1;i++)
        {
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();

            mul=num1*num2;
        }
        System.out.println("Multiplication :"+mul);

        System.out.println("Enter two number :");
        for(int i=1;i<=1;i++)
        {
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();

            div=num1/num2;
        }
        System.out.println("Division :"+div);

        System.out.println("Enter the number :");
        int count=0;
        for(int i=1;i<=10;i++)
        {
            int num1=scanner.nextInt();
            if((num1%2)==0)
            {
                System.out.println("The given no is (divide by 2) :" + num1);
                boolean b=((num1%2)==0);
                System.out.println("THe given no divided by (2) Yes:"+b);
                count++;
            }
            System.out.println(" How many number's divided by 2 between (1 to 10) "+count);
        }
    }
    public static void main(String[] args)
    {
        Example_ArithmeticOperators operators=new Example_ArithmeticOperators();
        operators.operation();
    }
}
