package com.example.ExampleKeywords;

import com.example.Exception.EligibleForVote;

public class Example_Final
{
   final int voterAge=18;

     final void display(int age)throws EligibleForVote
    {
        System.out.println("This is FINAL method can't override but can access");
        //i=20;
        if (age>voterAge)
            throw new EligibleForVote(" Eligible For Vot");
        else
            throw new EligibleForVote(" Not Eligible For Vot");
   }
    final void displayFinal()
    {
        System.out.println("Final");
    }

    public static void main(String[] args)throws EligibleForVote
    {
        Example_Final exampleFinal=new Example_Final();
        exampleFinal.display(20);
    }
}
