package com.Exception;

public class WithoutException {
    public static void main(String[] args) {
        int i, j, k;
        //i=10/0;
        //float l=10/3;
        try {
            j = 10 / 0;
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
        /*finally {
            System.out.println("welcome");
        }*/
        System.out.println("used Exception Handling concept");

        //System.out.println("Here not used Exception Handling concept");
    }
}
