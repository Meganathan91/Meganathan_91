package com.string;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Example_StringMethods
{
    public static void main(String[] args)
    {
        String[] s2={"How","Are","You"};
        String words="";
        StringBuffer buffer=new StringBuffer();
        for (String word:s2){
            words+=word;
            buffer.append(s2);
            /* String immutable, by any changes in string new string will be created.
              In string don't have such method like replace and append and more method.
              StringBuffer have such method so, this is mutable.
               How we differentiate that string and StringBuffer using memory using hashcode method. */
            System.out.println("Using String class :"+words.hashCode());
            System.out.println("Using StringBuffer class :"+buffer.hashCode());
        }
        String s="Hi";
        String s3="hi";
        String s6="a";
        String s5="s";
        String s4=new String(" !2Wel#4come&^ oh()");
        String s1=new String(" Welcome back we ");
        System.out.println("String length :"+s1.length());//17 including space.
        System.out.println("String Char :"+s1.charAt(6));//m
        System.out.println("String concat :"+s1.concat("You"));
        System.out.println("String UpperCase :"+s1.toUpperCase());//WELCOME
        System.out.println("String LowerCase :"+s1.toLowerCase());//welcome
        System.out.println("String substring :"+s1.substring(4));//come back we
        System.out.println("String substring :"+s1.substring(4,8));//come
        System.out.println("String trim :"+s1.trim());//"Welcome"
        System.out.println("String equals :"+s.equals(s3));//false
        System.out.println("String concat :"+s1.concat(" You"));
        System.out.println("String equalsIgnoreCase :"+s.equalsIgnoreCase(s3));//true
        System.out.println("String indexOf :"+s1.indexOf("e"));
        System.out.println("String lastIndexOf :"+s1.lastIndexOf("e"));
        //int i=s6.compareTo(s5);
        System.out.println("String compareTo :"+s5.compareTo(s6));
        System.out.println("String replace :"+s4.replace('o','a'));
        System.out.println("String replace :"+s4.concat("hi"));
        // replaceAll method This is used to remove special character in given string
        System.out.println("String replace :"+s4.replaceAll("o","a"));
        System.out.println("String replace :"+s4.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println("String replace :"+s4.replaceAll("[^a-zA-Z]",""));




    }
}
