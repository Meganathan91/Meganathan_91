package com.example.MethodInJava;
class CallByRefference
{
    int x,y;

    public CallByRefference() {

    }

    public CallByRefference(int i, int j)
    {
        this();
        this.x=i;
        this.y=j;
    }
   void display()
    {
        this.x=50;
        this.y=100;
    }
    void dis(CallByRefference call){
        this.display();
     call.x+=50;
    call.y+=100;
}
}
public class ParameterPassing
{
    public static void main(String[] args) {
        CallByRefference call=new CallByRefference(5,10);
        System.out.println(call.x+"  "+ call.y);
        call.display();
        call.dis(call);
        System.out.println(call.x+" "+ call.y);
    }
}
