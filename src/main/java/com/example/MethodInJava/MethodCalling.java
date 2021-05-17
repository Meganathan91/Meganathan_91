package com.example.MethodInJava;

import java.util.Scanner;

class Demo
{
    int total,j;
    static int k;
    public static int get(){
        System.out.println("I am static method");
        return k;
    }
    Demo()
    {
        k++;
    }
    Demo(int k)
    {
        this.j=k;
    }
    void display()
    {
        System.out.println("I am back :");
    }
    public int addition(int i, int i1)
    {
        display();
        total=i+i1;
        return total;
    }
}
public class MethodCalling
{
      public static void main(String[] args) {
        Demo obj=new Demo();
          Demo obj1=new Demo();
          Demo ob=new Demo(10);
          Scanner scanner=new Scanner(System.in);
          System.out.print("Enter any two integer :");
          int i=scanner.nextInt();
          int j=scanner.nextInt();
          System.out.println("!st number"+i+"Second Number"+j);
          int c=obj.addition(i,j);
          System.out.println(c);
          int k=ob.get();
          System.out.println("1st created constructor and calculated no of object" +
                                " created and called that in one method and returned :"+k);

    }
}
