package com.example.MethodInJava;
class Sample
{
    int x;
    int y;
}
public class ReturnMultiplevalue
{
    static Sample display(int a, int b)
        {
            Sample sam=new Sample();
            sam.x=a;
            sam.y=b;
            return sam;
        }
        public static void main(String[] args)
        {
            Sample get=display(5,10);
            System.out.println("First value :"+get.x+"  Second Value :"+get.y);
        }
    }
