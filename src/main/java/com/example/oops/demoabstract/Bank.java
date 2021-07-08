package com.example.oops.demoabstract;


 public abstract class Bank {
    Bank() {
        System.out.println("abstract class constructor");
    }

    abstract void openBankAccount();

    public void deposit() {
        System.out.println();

    }
    public void withdraw() {
        System.out.println();

    }

}
