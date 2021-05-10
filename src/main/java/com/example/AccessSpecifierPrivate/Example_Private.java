package com.example.AccessSpecifierPrivate;

public class Example_Private
{
    private int b=10;
    private void displayPrivate()
    {
        System.out.println("Example ");
    }

    public static void main(String[] args)
    {
        Example_Private aPrivate=new Example_Private();
        aPrivate.displayPrivate();
        System.out.println(aPrivate.b);
    }
}
