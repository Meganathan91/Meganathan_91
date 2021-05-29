package com.example.Constructor;
class Demo
{
    private Demo()
    {

    }
    static Demo demo=null;
    static public Demo getInstance()
    {
        if(demo==null)
        {
            demo=new Demo();
        }
        return demo;
    }
}
public class SingletonClasses
{
    public static void main(String[] args)
    {
        Demo demo= Demo.getInstance();
        //Demo o=new Demo();
    }
}
