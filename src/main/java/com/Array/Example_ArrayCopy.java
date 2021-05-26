package com.Array;

import java.util.Arrays;

public class Example_ArrayCopy
{
    static void display() {
        int max[] = new int[5];
        int min[] = max.clone();
        System.out.println("Cloned array :" + min.length);

        //Array copy. Method arraycopy
        int[] x = {1, 2, 3};
        //int[] z=x.clone(); //using clone method.
        int[] y = new int[x.length];
        System.arraycopy(x, 1, y, 1, 2);
        System.out.println("using array copy :" + y.length);
        for (int a1 = 0; a1 < y.length; a1++) {
            System.out.println("System.arraycopy :" + y[a1]);
        }

        //method copyOf
        int m[] = {1, 2, 3, 4, 5};
        int n[] = Arrays.copyOf(m, 4);
        //System.out.println("using copyOf :"+n.length);
        for (int m1 = 0; m1 < n.length; m1++) {
            System.out.println("using Arrays.copyOf method :" + n[m1]);
        }


        int m1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n1[] = Arrays.copyOfRange(m1, 3, 7);// Here not taking 3 but 4,5,6.
        System.out.println("using copyOfRange :" + n1.length);//length 3.
        for (int i = 0; i < n1.length; i++) {
            System.out.println(" "+n1[i]);
        }
    }
    public static void main(String[] args) {
        display();
    }
}
