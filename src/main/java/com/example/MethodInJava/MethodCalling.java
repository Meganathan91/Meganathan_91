package com.example.MethodInJava;
import java.util.Scanner;
class Demo
{
    int total=0;
    void display()
    {
        System.out.println("I am back, but am won't return any thing. :");
    }
    String noParameter()
    {

       return "Welcome";
    }
    int addition(int i, int j)
    {
        display();
        total=i+j;
        return total;
    }
}
public class MethodCalling
{
      public static void main(String[] args) {
          Demo obj=new Demo();
          obj.display();

          Demo obj1=new Demo();
          String s=obj1.noParameter();// not passing any parameter, but returning some thing.
          System.out.println("Returning value but not passing any parameter :"+s);

          Scanner scanner=new Scanner(System.in);
          System.out.print("Enter any two integer :");
          int i=scanner.nextInt();
          int j=scanner.nextInt();
          System.out.println(" 1st number :"+i+" Second Number :"+j);
          int c=obj.addition(i,j);
          System.out.println("The addition of two number is :"+c);
      }
}
