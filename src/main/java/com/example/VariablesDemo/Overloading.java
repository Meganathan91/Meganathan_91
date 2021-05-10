package com.example.VariablesDemo;

public class Overloading
{
    public static void main(String[] args) {
        Overloading overloading=new Overloading();
        //overloading.get(10);
        overloading.get(10.0,78);
    }

    private void get(double v, int i) {
        System.out.println(""+v+ " "+i);
    }

    /*void get(int i)
    {
        System.out.println(i);
    }*/
}
