package com.string;

public class Example_StringBuilder
{
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("Welcome Dude Hi Welcome");
        System.out.println(builder.indexOf("Dude"));
        System.out.println(builder.indexOf("Welcome"));
        System.out.println(builder.lastIndexOf("Welcome"));
        System.out.println(builder.insert(0,"Hi"));
        System.out.println(builder.replace(13,14,"We"));
        System.out.println(builder.delete(0,6));
        System.out.println(builder.deleteCharAt(0));
        System.out.println(builder.replace(13,14,"Hi"));
        System.out.println(builder.append(" Well"));
        System.out.println(builder.reverse());
        builder.setCharAt(0,'a');
        System.out.println(builder);








    }
}
