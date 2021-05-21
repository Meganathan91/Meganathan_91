package com.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public interface Example_FileReadingWriting
{
    public static void main(String[] args) throws IOException{
        File file=new File("D:\\Megan\\filereadingwriting.txt");
        FileWriter writ = null;
        FileReader reader=null;
        try {
            file.createNewFile();
            writ=new FileWriter(file,true);
            writ.write("Welcome \n");
            writ.write(89);
            writ.flush();
            reader=new FileReader(file);
            int outbut=reader.read();
            while(outbut!=-1)
            {
                System.out.print((char) outbut);
                outbut=reader.read();

            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            writ.close();
        }
    }
}
