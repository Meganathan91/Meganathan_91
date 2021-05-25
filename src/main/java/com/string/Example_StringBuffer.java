package com.string;

public class Example_StringBuffer
{
    public static void main(String[] args)
    {
        StringBuffer buffer=new StringBuffer("Hi da welcome to my home on time");
        StringBuffer buffer1=new StringBuffer("We Welcome You");
        buffer.append("Welcome");
        buffer.append(10);
        System.out.println(buffer.length());
        System.out.println(buffer.capacity());
        System.out.println(buffer.insert(3,"Welcome"));
        System.out.println(buffer.insert(3,'e'));
        System.out.println(buffer1.reverse());
        System.out.println(buffer1.deleteCharAt(0));
        System.out.println(buffer1.delete(0,2));
        System.out.println(buffer1.replace(10,11,"Friends"));
        buffer.setCharAt(3,'W');
        System.out.println(buffer);






    }
}
