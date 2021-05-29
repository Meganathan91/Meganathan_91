package com.filehandling;

import java.io.*;

public class Output_Stream
{
    public static void main(String[] args)throws IOException
    {
        OutputStream outputStream=new FileOutputStream("D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Java\\Stream @ FileHandling\\File\\Sample.txt");
        try
        {
            OutputStreamWriter writer=new OutputStreamWriter(outputStream);
            writer.write("Time for Learn");
            writer.flush();
        }
        catch (IOException e)
        {
        }
        finally
        {
            outputStream.close();

        }
        }
    }