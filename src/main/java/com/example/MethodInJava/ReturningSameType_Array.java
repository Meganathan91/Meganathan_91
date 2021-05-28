package com.example.MethodInJava;
public class ReturningSameType_Array
{
    static int[] display(int a,int b)
    {
        //All returned element as same type.
        int[] c=new int[2];
        c[0]=a+b;
        c[1]=a-b;
        return c;
    }
    public static void main(String[] args)
    {
       int[] demo=display(10,20);
        System.out.println("Sum of two value and stored in 0th index :"+demo[0]);
        System.out.println("Subtraction of two value and stored in 1th index :"+demo[1]);
    }
}