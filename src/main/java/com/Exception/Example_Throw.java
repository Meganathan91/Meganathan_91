package com.Exception;

import org.apache.coyote.http11.filters.IdentityOutputFilter;

import java.io.FileReader;
import java.io.IOException;

//Here we learn about throw and throws keyword in Exception Handling in Java.
public class Example_Throw {
    void operation()  throws IOException{
        int a[] = new int[5];
        int[] b = {12, 34, 54, 65};
        //System.out.println(b[4]);
        FileReader fileReader = new FileReader("C:/Users/ELCOT/Documents/Example.java");
        throw new IOException();
    }

    public static void main(String[] args) {

        Example_Throw exampleThrow = new Example_Throw();
        try {
            exampleThrow.operation();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
