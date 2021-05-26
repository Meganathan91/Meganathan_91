package com.operators.ArithmeticOperators;
import java.util.Scanner;
public class Example_RelationalOperator
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two value for comparison :");
        int i=scanner.nextInt();
        int j=scanner.nextInt();
        if(i>j)
        {
            System.out.println("I i greater than j :"+true);
        }
        else {
            System.out.println("Lesser :"+false);
        }
        int p=scanner.nextInt();
        int q=scanner.nextInt();
        if(p==q)
        {
            System.out.println("p and q both are equal :"+true);
        }
        else {
            System.out.println("Not equal :"+false);
        }
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        if(x!=y)
        {
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }
    }
}
