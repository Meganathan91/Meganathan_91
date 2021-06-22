package com.correction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Sample.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedreader = new BufferedReader(reader);
            String line = null;
            int wordCount = 0;
            String[] word = null;
            while ((line = bufferedreader.readLine()) != null) {
                word = line.split(" ");
                wordCount=wordCount+word.length;
            }
            System.out.println("Word Count :" + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
