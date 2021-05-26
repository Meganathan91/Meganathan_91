package com.string;

public class Example_StringDemo
{
    public static void main(String[] args)
    {
        char c='a';
        char[] ch={'w','e','l','c','o','m','e'};
        System.out.println(ch);
        String sentence="";
        String names[]={"Hi","Welcome","Dude"};
        String s=new String();
        StringBuffer sb=new StringBuffer();
        StringBuilder sbul=new StringBuilder();
        for(String name:names) {
            sentence=sentence+name;
            sb.append(name);
            System.out.println("String hashcode :"+sentence.hashCode());
            System.out.println("StringBuffer hashcode :"+sb.hashCode());
        }
        System.out.println("String class :"+sentence);
        System.out.println("StringBuffer class:"+sb);
        }
}
