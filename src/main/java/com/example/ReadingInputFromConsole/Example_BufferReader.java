package com.example.ReadingInputFromConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example_BufferReader
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file=reader.readLine();//This is used to read file mean string values.
        System.out.println(file);
    }
}
