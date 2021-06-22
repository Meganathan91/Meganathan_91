package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class ArrayWithLoop {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list=new ArrayList();
        try {
            System.out.println("Enter your array size :");
            int arrayLength = Integer.parseInt(reader.readLine());
            int[] l = new int[arrayLength];
            int i = 0;
            int total = 0;
            while (i < l.length) {
                l[i] = Integer.parseInt(reader.readLine());
                total = total + l[i];
                i++;
            }
            System.out.println(total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}