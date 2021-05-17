package com.example.ArrayConcept;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Operation
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Find addition no / 2 between 100 :");
        int num=scanner.nextInt();
        int i=0;
        int total=0;
        int[] a=new int[num];
                int j=a.length;
        System.out.print("Length of array :"+j);
                while(a[i]<=j){
                        a[i]=scanner.nextInt();
                    //System.out.println("The  :"+a[i]);
                       if(a[i]%2==0)
                       {
                           total=total+a[i];
                           System.out.println("Sum of no :"+a[i]);
                       }
                        a[i]++;
                }
    }

}
