package com.example.ReadingInputFromConsole;

import java.util.Scanner;

public class Example_Scanner
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        //boolean b= scanner.hasNext();
        int num=scanner.nextInt();

        System.out.println(num);

        System.out.println(scanner.nextInt());

        boolean status= scanner.hasNext();

        int j=Integer.parseInt("10");//User to read integer but in "10".

    }
}
