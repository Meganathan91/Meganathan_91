package com.example.ConditionalStatement;

import java.util.Scanner;

public class Example_ConditionalStatement
{
    String userName="Meganathan";
    String password="permission";
    void checkCondition()
    {
        if((userName=="Meganathan") && (password=="permission"))
        {
            System.out.println("Login Successfully :"+true);
        }
        else
        {
            System.out.println("Incorrect Password :"+false);

        }

    }

    public static void main(String[] args)
    {
        Example_ConditionalStatement statement=new Example_ConditionalStatement();
        statement.checkCondition();
    }
}
