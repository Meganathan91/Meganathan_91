package com.filehandling;
import java.io.*;
public class Example_BufferReaderWriter
{
    public static void main(String[] args)throws IOException  {
        BufferedWriter bfwriter=null;
        try
        {
        File file=new File("D:\\Megan\\filereadingwriting.txt");
        FileWriter writer=new FileWriter(file);
        bfwriter=new BufferedWriter(writer);
        bfwriter.write("Welcome to. Bu SoftTech.");
        bfwriter.newLine();
        bfwriter.write("We are here. joined as. Software trainee.");
        bfwriter.flush();
        FileReader fReader=new FileReader(file);
        BufferedReader breader=new BufferedReader(fReader);
        String line=breader.readLine();
        int linecount=0;
        int sentenceCount=0;
        int wordcount=0;
        int charactercount=0;
            while(line!=null)
        {
            //Sentence count:(.)
            String[] sentence=line.split("[.]");
            sentenceCount=sentenceCount+sentence.length;

            //Word count:
            String[] word=line.split(" ");
            System.out.println("jbjhbjb:"+word);
            wordcount=wordcount+word.length;
            charactercount=charactercount+line.length();
            linecount++;
            line=breader.readLine();

        }
            System.out.println("No of line :"+linecount);
            System.out.println("No of sentences :"+sentenceCount);
            System.out.println("No of word's :"+wordcount);
            System.out.println("No of charactercount's :"+charactercount);


        }


        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            bfwriter.close();
        }
}}