package com.example.Looping;
import java.io.IOException;
import java.util.Scanner;
public class Example_ConditionalStatement
{
   public static void main(String[] args)throws IOException
    {
        Example_ConditionalStatement statement=new Example_ConditionalStatement();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter accno :");
        int number=(char)scanner.nextInt();
        System.out.print(number);
        int accno= 250;
        if(accno==number)
            {
                System.out.println("Login Successfully :");
            }
            else
            {
                System.out.println("Incorrect Password :");
            }
    }
}
