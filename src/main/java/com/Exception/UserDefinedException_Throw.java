package com.Exception;

public class UserDefinedException_Throw {
    void notEligibleForvote(int age) {
        if (age >= 18) {
            throw new EligibleForVote("EligibleForVote");
        } else {
            throw new EligibleForVote("Not EligibleForVote");
        }
    }

    public static void main(String[] args) {
        UserDefinedException_Throw aThrow = new UserDefinedException_Throw();

        //EligibleForvote(19);
        try {
            aThrow.notEligibleForvote(15);
        } catch (EligibleForVote e) {
            System.out.println(e.getMessage());
        }
    }
}