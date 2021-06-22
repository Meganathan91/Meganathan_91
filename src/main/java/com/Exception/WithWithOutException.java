package com.Exception;
public class WithWithOutException
{
    void display()
    {

        //System.out.println("We Welcome Exception");
    }
    public static void main(String[] args)
    {
        String name="Welcome";
        /*int x,y;
        x=10;
        y=x/0;
        System.out.println(" :"+x);*/
        try
        {
            int i = 10;
            int j = 10 / 0;
           // int k=78.54f;
            int l=Integer.parseInt("10");
            //System.exit(0);
            System.out.println(i);
            //System.out.println(k);
        }
        catch (Exception e)
        {
            boolean l = false;
            System.out.println(l);
            //e.getMessage();
            e.printStackTrace();
            //System.out.println(" Exception catch block:"+e);
        }

        System.out.println(name);

    }
}
