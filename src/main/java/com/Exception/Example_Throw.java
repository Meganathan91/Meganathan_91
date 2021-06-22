package com.Exception;
import java.io.FileReader;
import java.io.IOException;

//Here we learn about throw and throws keyword in Exception Handling in Java.
public class Example_Throw
{
    static void operation()throws IOException
    {
        int a[] = new int[5];
        int[] b = {12, 34, 54, 65};
        //System.out.println(b[4]);
        FileReader fileReader=new FileReader("C:/Users/ELCOT/Documents/Example.java");
        //throw new IOException("File exception");
        throw new IOException("FileException");
    }
    //throws IOException
    public static void main(String[] args)throws IOException
    {
        operation();
        //Example_Throw exampleThrow=new Example_Throw();
        // operation();
        try
        {
            operation();
        }catch (IOException e)
        {
            //System.out.println("File exception handled");
            e.printStackTrace();
        }
    }
}
