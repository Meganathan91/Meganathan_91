package com.example.AccessSpecifierProtect;

public class Example_Protect
{
    protected void protectDisplay()
        {
    System.out.println("I am from protect");
        }

    public static void main(String[] args) {
        Example_Protect protect=new Example_Protect();
        protect.protectDisplay();
    }
}

