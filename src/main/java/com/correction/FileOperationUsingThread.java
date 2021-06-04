package com.correction;

import sun.applet.Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOperationUsingThread implements Runnable {
    public void run() {
        try {
            String s = null;
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Sample.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*static {
        String[] file = {"D:\\Megan\\BEYON UNIVERSE SOFTWARE TECHNOLOGIES PVT LTD\\Sample.txt"};
        main(file);
    }*/
    public static void main(String[] args) {
        FileOperationUsingThread thread = new FileOperationUsingThread();
        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);
        t1.start();
        t2.start();
    }
}
