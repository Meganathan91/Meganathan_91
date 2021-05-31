package com.Test;

public class ArrayMinMaxCount
{
    static void getMin(int[] array)
    {
        int input[]=array;
        int min=array[0];
        for(int i=1;i<input.length;i++)
        {
            if(input[i]<min)
            {
                min=input[i];
            }
        }
        System.out.println(min);
    }

    static void getMax(int[] array)
    {
        int input[]=array;
        int max=array[0];
        for(int i=1;i<input.length;i++)
        {
            if(input[i]>max)
            {
                max=input[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args)
    {
        int array[] = {1, 4, 3, 5, 2, 6};
        getMin(array);
        getMax(array);
        int sum=0;
        int count=0;
        //System.out.println(array.length);
        for(int i=0;i<array.length;i++)
        {
            count=count=array[i];
            sum=sum+array[i];
        }
        System.out.println("Array Sum "+sum);
        System.out.println("Array Count "+count);
    }
}
