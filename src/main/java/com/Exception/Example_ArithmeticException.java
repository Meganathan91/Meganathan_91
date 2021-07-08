package com.Exception;

public class Example_ArithmeticException extends RuntimeException{
    public static void voteStatus(int age)  {
        if (age== 18) {
            throw new ArrayIndexOutOfBoundsException("Eligible for vote");
        } else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        Example_ArithmeticException arithmeticException = new Example_ArithmeticException();
        try {
            //int j=10/0;
            voteStatus(30);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
