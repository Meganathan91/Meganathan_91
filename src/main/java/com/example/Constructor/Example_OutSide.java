package com.example.Constructor;

public class Example_OutSide extends Example_Constructor
{
    //String name;
    Example_OutSide(String welcome)
    {
        //System.out.println(super.i);
        super("hi");
        System.out.println(super.i);    
        //this.name=welcome;
    }
    Example_OutSide()
    {
        super();
    }
   public static void main(String[] args)
    {
        Example_OutSide outSide=new Example_OutSide("hi");
    }
}
