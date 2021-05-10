package com.example.Exception;

public class WithUsingException
{
    public static void main(String[] args)
    {
        try
        {
            int x,y,k;
            //x=10/0;
            //System.out.println(x);
            //int j=(int)(10/5f);
            //System.out.println(k);
            //int z[]={12,90};
            int z[]=new int[1];
            z[0]=10;
            //z[1]=20;
            System.out.println(z[0]);
            //System.out.println(z[1]);

            k=20;
            //NumberFormateException
            int a=Integer.parseInt("10");
            System.out.println(a);
            //int c=10/0;
            //System.out.println(c);
            String name=null;
            int b=name.length();
            System.out.println("Null pointer exception :"+b);
        }
        /*catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }*/
        catch (ArithmeticException | NullPointerException e)
        {
            e.printStackTrace();
        }
                /*catch (ArrayIndexOutOfBoundsException e)
                {
                    e.printStackTrace();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }*/
        System.out.println("Welcome to BU SOFT TECH");
    }
}
