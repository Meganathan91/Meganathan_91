package com.operators.ArithmeticOperators;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Meganathan Subramaniyan
 * @version 2021-v1
 * @since 30-06-2021
 * https://www.geeksforgeeks.org/comments-in-java/?ref=lbp
 */
public class Example_ArithmeticOperators {

    //instance variable's
    int sum = 0, sub = 0, div = 0, mul = 0, num = 0;

    Scanner scanner = new Scanner(System.in);

    //default method
    void operation() {
        System.out.println("Enter number's :");
        for (int i = 1; i <= 2; i++) {
            num = scanner.nextInt();
            sum += num;
        }
        sub = sum - num;
        mul = sum * sub;
        try {
            div = mul / num;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        int resultOfTernaryOperator = ((div < mul) ? mul : div);
        System.out.println("Addition :" + sum + "\n"
                + "Subtraction :" + sub + "\n"
                + "Multiplication :" + mul + "\n"
                + "Division :" + div + "\n"
                + "TernaryOperator :" + resultOfTernaryOperator + "\n");


        /*
         * Get the input from console using Scanner class, num between 1-10 using logical AND operator,
         * Using loop checked five number's only, the num divide by 2,
         * The num divide by 2 displayed that num and status,
         * Displayed how many num divided by 2 that count and sum of that num.
         */

        //local variable's
        int count = 0, sum = 0;
        System.out.println("Enter number between (1 -10) :");
        int num = scanner.nextInt();
        if (num < 11 && num > 0)
            for (int i = 1; i <= num; i++) {
                int num1 = scanner.nextInt();
                if ((num1 % 2) == 0) {
                    System.out.println("The given no is (divide by 2) :" + num1);
                    boolean b = ((num1 % 2) == 0);
                    System.out.println("The given no divided by (2) Yes:" + b);
                    sum += num1;
                    count++;

                }
                System.out.println(" How many number's divided by 2 between (1 to 10) " + sum + " " + count);
            }
    }

    public static void main(String[] args) {
        Example_ArithmeticOperators operators = new Example_ArithmeticOperators();
        operators.operation();
    }
}