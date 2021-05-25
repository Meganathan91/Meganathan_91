package com.Array;

import java.util.*;
public class Example_ArrayCompare
{
    public static void main(String[] args) {
        //Array compare == for reference compare.
        int[] a={1,2,3};
        int[] b={1,2,3};

        if(Arrays.equals(a,b))
            System.out.println(" Using .equal method in array compare Same");
        else
            System.out.println("Using .equal method in array compare Not Same");

        int c1=10;
        int d1=10;
        if(c1==d1){
            System.out.println("This is for reference compare same");
        }
        //Normal compare for



    //Array compare  .equal content compare.
    int[] a1={1,2,3};
    int[] b1={1,2,3};
        if(Arrays.equals(a1,b1))
        System.out.println("Same");
        else
                System.out.println("Not Same");

        //Array compare deep equal using .equal .
        int[] a2={1,2,3};
        int[] b2={1,2,3};
        Object[] arr1={a2};
        Object[] arr2={b2};
        if(Arrays.equals(arr1,arr2))
            System.out.println("deep compare using .equal (Same)");
        else
            System.out.println("deep compare using .equal (Not Same)");

        int[] a3={1,2,3};
        int[] b3={1,2,3};
        Object[] arr3={a3};
        Object[] arr4={b3};
        if(Arrays.deepEquals(arr1,arr2))
            System.out.println("deep equal compare using .equal (Same)");
        else
            System.out.println("deep equal compare using .equal (Not Same)");
    }
}


