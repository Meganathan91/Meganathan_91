package com.example.MethodInJava;
class CallByRefference
{
    int x,y;

    CallByRefference()
    {
        System.out.println("Am empty constructor");
    }
    CallByRefference(int i, int j)
    {
        this();
        this.x=i;
        this.y=j;
    }
   void display()
    {
        x=50;
        y=100;
        System.out.println("Call by value :"+x+" "+y);
    }
    void dis(CallByRefference call)
    {
        this.display();
        call.x+=50;
        call.y+=100;
        System.out.println("Call by reference :"+x+" "+y);
    }
}
public class ParameterPassing
{
    public static void main(String[] args)
    {
        CallByRefference call=new CallByRefference(5,10);
        System.out.println(call.x+"  "+ call.y);
        call.display();
        call.dis(call);
        System.out.println(call.x+" "+ call.y);
    }
}
