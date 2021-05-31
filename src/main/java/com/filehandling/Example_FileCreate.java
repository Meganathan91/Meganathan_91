package com.filehandling;
import java.io.File;
import java.io.IOException;
public class Example_FileCreate
{
    public static void main(String[] args)  {
        File file=new File("D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Java\\Stream @ FileHandling\\File");
        boolean b=file.exists();
        System.out.println(b);
        if(b==false)
        {
            file.mkdir();
            b=file.exists();
            System.out.println(b);
        }
        file=new File("D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Java\\Stream @ FileHandling\\File\\Demo.txt");
        b=file.exists();
        System.out.println(b);
        if(b==false)
        {
            try
            {
            b=file.createNewFile();
                System.out.println("File Ceated Successfully :"+b);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        //Delete file.
        file=new File("D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Java\\Stream @ FileHandling\\File\\Demo.txt");
        file.delete();
        b=file.exists();
        System.out.println("File  Deleted :"+b);
        try{
        b=file.createNewFile();
            File file1=new File("D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Java\\Stream @ FileHandling\\File\\Sample.txt");
            file.renameTo(file1);
            System.out.println("Renamed file name :"+file1.getName());
            System.out.println("File path :"+file1.getPath());
            System.out.println("Successfully Renamed :"+b);
    }catch (IOException e)
        {
            e.printStackTrace();
        }
        File file2=new File("D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Java\\Collection");
        String list[]=file2.list(); // Collection this file list only displayed.
        /*for (String a : list)
        {
            System.out.println(a);
        }*/
         for(int i=0;i<list.length;i++) {
             System.out.println(list[i]);
         }
        File folderfile[]=file2.listFiles();
         for(int i=0;i<folderfile.length;i++){
             System.out.println(folderfile[i]);
         }
        // Going to print only file.
        for(File f:folderfile){
            if(f.isFile())
            System.out.println(f);
        }
        System.out.println("File and Directory displayed differently");
        //Need only Directory
        for(File f:folderfile){
            if(f.isDirectory())
                System.out.println(f);
        }
        //Need .txt file only from particular location.
        File all=new File("D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Daily Report");
                File filefolder[]=all.listFiles();
        for(File listall:filefolder)
        {
            if(listall.isFile()) {
                String filename = listall.getName();
                int dot = filename.lastIndexOf(".");
                String extension = filename.substring(dot + 1);
                if(extension.equals("xlsx"))
                {
                    if(listall.length()>90)
                    System.out.println("Display only .txt file :"+filename.length());
                }
            }
        }

    }
}
