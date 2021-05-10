package com.example.Exception;

import org.springframework.boot.jdbc.DatabaseDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example_Finally {

    public static void main(String[] args)
    {
        try
        {
            FileReader reader=new FileReader("demo.txt");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {

        }
    }
}