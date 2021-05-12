package com.example.ConstructorOutSide;

import com.example.Constructor.Example_Constructor;

public class Example_OutSide extends Example_Constructor
{
    Example_OutSide()
    {
        super("welcome");
    }
    public static void main(String[] args)
    {
        Example_OutSide outSide=new Example_OutSide();

    }
}
