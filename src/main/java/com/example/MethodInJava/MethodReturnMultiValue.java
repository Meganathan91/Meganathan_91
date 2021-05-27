package com.example.MethodInJava;
class ArithmeticOperation
{
    public float addition;
    public double subtraction;
    public float multiply;
    public float division;
}
 class MethodReturnMultiValue
 {
     static ArithmeticOperation operation(int x,float y)
    {
        ArithmeticOperation opera=new ArithmeticOperation();
        opera.addition=x+y;
        opera.subtraction=x-y;
        opera.multiply=x*y;
        opera.division=x/y;

    return opera;
    }

    public static void main(String[] args)
    {
        ArithmeticOperation arithmetic=operation(100,20);
        System.out.println(arithmetic.addition);
        System.out.println(arithmetic.subtraction);
        System.out.println(arithmetic.multiply);
        System.out.println(arithmetic.division);
    }
}