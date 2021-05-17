package com.example.VariablesDemo;

import java.util.ArrayList;

public class Example_WrapperClass
{
    public static void main(String[] args)
    {
        //Those everything have some method.
        short b= (byte) 128;
        byte b1=127;
        System.out.println(" short "+b+" byte "+b1 );
        Integer i=10;
        Float f=(float)123.0;
        //Float ff=123.0f;
        Double d=123.00;
        //Boolean b=false;
        Character c='a';
        String s="welcome";
        System.out.println(i.intValue());
        System.out.println(f.floatValue());
        System.out.println(d.doubleValue());
        //System.out.println(b.booleanValue());
        System.out.println(c.charValue());

    }
}
