package com.Array;

import java.sql.Array;
import java.util.Arrays;

public class Example_Array$Copy {
    static void display(int b[]) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
            //System.out.println(" " + b[i]);
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
        display();
        int arr[] = {1, 2, 3, 4, 5};
        display(arr); // Passing array to methods.
        int arrs[] = m1();// Returning array to method.
        for (int i = 0; i < arrs.length; i++)
            //System.out.println("Returning array :" + arrs[i]);
        sum = add(5, 6);
        //System.out.println("two number :" + sum);

    }

    static int add(int a, int b) {
        int sum = a + b;
        //System.out.println(sum);
        return sum;
    }

    static int[] m1() {
        return new int[]{0,1,2,3,4,5};
    }

    //Cloning of on array.
    static void display()
    {
        int max[] = new int[5];
        int min[] = max.clone();
        //System.out.println("Cloned array :"+min.length);

        //Array copy. Method
        int a[]={1,2,3};
        int b[]=new int[a.length];
        for(int k=0;k<a.length;k++){
            b[k]=a[k];
            System.out.println("Array copy :"+b[k]);
        }

        //Array copy. Method arraycopy
        int x[]={1,2,3};
        int z[]=x.clone(); //using clone method.
        int y[]=new int[a.length];
            System.arraycopy(x,0,y,0,3);
        }

        //method copyOf
        int m[]={1,2,3};
        int n[]=Arrays.copyOf(m,3);

    int m1[]={1,2,3,4,5,6,7,8,9};
    int n1[]=Arrays.copyOfRange(m1,3,8);
    }
