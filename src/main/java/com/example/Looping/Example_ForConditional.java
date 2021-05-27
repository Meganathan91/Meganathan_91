package com.example.Looping;
import java.util.Scanner;
public class Example_ForConditional
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int j=scanner.nextInt();
        System.out.println("Length of the total number want to add :"+j);
        int total=0;
        for(int i=1;i<=j;i++)
        {
            int number=scanner.nextInt();
            total=total+number;
        }
        System.out.println("Total :"+total);
    }
}
