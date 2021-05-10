package com.example.AllSpecifier;

import com.example.AccessSpecifierPrivate.Example_Private;

public class Example_OutSidePrivate extends Example_Private
{
    public static void main(String[] args)
    {
        Example_OutSidePrivate sidePrivate=new Example_OutSidePrivate();
        //sidePrivate.displayPrivate();
    }
}
