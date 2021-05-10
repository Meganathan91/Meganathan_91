package com.example.Exception;

public class UserDefinedException_Throw
{
    static void notEligibleForvote(int age)throws Exception  {
        if (age>18)
        {
            throw new EligibleForVote("EligibleForVote");
        }
        else
        {
            throw new EligibleForVote("Not EligibleForVote");
        }
    }
    public static void main(String[] args)throws Exception
    {
        UserDefinedException_Throw aThrow=new UserDefinedException_Throw();

        //notEligibleForvote(19);
        try
        {
            notEligibleForvote(15);
        }
        catch (EligibleForVote e)
        {
            //System.out.println("You Are eligible For Vote");
            e.printStackTrace();
        }
    }
}