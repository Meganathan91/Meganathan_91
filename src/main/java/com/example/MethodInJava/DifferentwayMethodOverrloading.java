package com.example.MethodInJava;

import java.awt.image.SampleModel;
class Sample
{
     double add(int i, float j){
         double sum=i+j;
        return sum;
    }
}
public class DifferentwayMethodOverrloading
{
    public static void main(String[] args)
    {
        Sample sample=new Sample();
        int l= (int) sample.add(1044444,(float)2765.85);
        System.out.println(l);
    }
}
