package com.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.*;

public class FileHandling
{
    public static void main(String[] args)throws IOException
    {
        File file=new File("D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Java\\Stream @ FileHandling\\File\\Sample.txt");
        FileReader reader=new FileReader(file);
        BufferedReader bufferedreader=new BufferedReader(reader);
        String line=bufferedreader.readLine();
        System.out.println(line);
        int wordCount=0;
        String[] count=line.split(" ");
        wordCount=count.length;
        System.out.println("Word Count :"+wordCount);
    }
}
