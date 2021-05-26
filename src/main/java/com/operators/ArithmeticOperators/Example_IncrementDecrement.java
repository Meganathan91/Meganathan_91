package com.operators.ArithmeticOperators;

public class Example_IncrementDecrement {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Increment (i++) :" + (i++));//5
        int j = 5;
        System.out.println("Decrement (j-1) :" + (j - 1));//4
        int k = 5;
        System.out.println("Increment (k+1) :" + (k + 1));//6
        int l = 5;
        System.out.println("Decrement (++l):" + (++l));//6
        int n = 15;
        System.out.println("Decrement (l--):" + (n--));//15
        int o = 5;
        System.out.println("Decrement (--l):" + (--o));//4

        int x = 10;
        x = -x;
        boolean b=false;
        System.out.println(x);
        if ((x) != -10) {
            System.out.println("hi " + b);
        } else {
            System.out.println("yes " + b);
        }
    }
}