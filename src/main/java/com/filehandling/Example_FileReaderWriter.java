package com.filehandling;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Example_FileReaderWriter
{
        public static void main(String[] args) throws IOException {
            File file=new File("D:\\Megan\\");
            FileWriter writ = null;
            FileReader reader=null;
            try {
                if(file.isDirectory()){
                    file.mkdir();
                }
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