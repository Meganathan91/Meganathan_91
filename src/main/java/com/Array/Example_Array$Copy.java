package com.Array;

import java.sql.Array;
import java.util.Arrays;

public class Example_Array$Copy {
    static void display(int b[]) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
            System.out.println(" " + sum);
        }
    }
    void multiArray()
    {
           int a[][]=new int[2][2];// Multidimensional array
        a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
        int i,j;
        for( i=0;i<2;i++){
            for( j=0;j<2;j++){
                System.out.println(a[i][j]);

            }
        }
    }

    public static void main(String[] args) {
        Example_Array$Copy demo=new Example_Array$Copy();
        demo.multiArray();
        int sum=0;
        int[] a={1,2,3,4,5};
        display(a);
        int arr[] = {1, 2, 3, 4, 5};
        display(arr); // Passing array to methods.
        int arrs[] = m1();// Returning array to method.
        for (int i = 0; i < arrs.length; i++)
            System.out.println("Returning array :" + arrs[i]);
        sum = add(5, 6);
        System.out.println("two number :" + sum);

    }

    static int add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    static int[] m1()
    {
        return new int[]{0,1,2,3,4,5};
    }
}
