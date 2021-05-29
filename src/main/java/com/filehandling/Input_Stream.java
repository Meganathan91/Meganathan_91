package com.filehandling;

import java.io.*;
import java.io.File.*;

public class Input_Stream
{
    public static void main(String[] args)throws IOException
    {
        InputStream inputStream=new FileInputStream("D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Java\\Stream @ FileHandling\\File\\Sample.txt");
        try
        {
            byte[] word=new byte[inputStream.available()];
           inputStream.read(word);
           String buffer=new String(word);
            System.out.println(buffer.substring(3));
            System.out.println(buffer.substring(6,13));
            System.out.println(buffer.concat(" Dude's"));
            System.out.println(buffer.charAt(4));
            System.out.println(buffer.indexOf("Hi"));
            System.out.println(buffer.lastIndexOf("Hi"));
            System.out.println(buffer.length());
             /*int content;
            while ((content=inputStream.read())!=-1)
            {
                System.out.println((char)content);
            }*/
        }
        catch (IOException e)
        {
        e.printStackTrace();
        }
        finally {
            inputStream.close();
        }
    }
}
