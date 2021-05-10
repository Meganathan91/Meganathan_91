package com.example.AllSpecifier;

import com.example.AccessSpecifierProtect.Example_Protect;

public class Example_OutSideProtect extends Example_Protect
{
    public static void main(String[] args)
    {
        Example_OutSideProtect outSideProtect=new Example_OutSideProtect();
        outSideProtect.exampleProtect();
    }
}
