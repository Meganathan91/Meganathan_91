package com.Array;

import java.util.Arrays;

public class Example_ToStringMethod
{
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        char ch[]=new char[]{'a','e','i','o','u'};
        float f[]=new float[]{123,3423,23,67};
        double d[]=new double[]{2000,45000,10000};
        boolean b[]=new boolean[]{false,true};
        String s[]=new String[]{"hi","welcome","how","are","you"};
        System.out.print(a);
        System.out.println(ch);
        System.out.print(d);
        System.out.print(b);
        System.out.println(s);
        System.out.println(Arrays.toString(a));
        System.out.print(Arrays.toString(ch));
        System.out.println(Arrays.toString(f));
        System.out.print(Arrays.toString(d));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(s));

        StringBuilder builder=new StringBuilder("BUSoftTech");
        char[] c={'w','e','l','c','o','m','e','s','U'};
        System.out.println(builder.append(c));


    }


}
