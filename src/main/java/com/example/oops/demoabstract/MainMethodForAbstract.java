package com.example.oops.demoabstract;

public class MainMethodForAbstract {
    MainMethodForAbstract() {
        System.out.println("MainMethodForAbstract");
    }

    public static void main(String[] args) {
        Bank sbi = new Sbi();
        sbi.openBankAccount();
        Bank canaraBank = new CanaraBank();
        canaraBank.openBankAccount();
        Bank indianBank = new IndianBank();
        indianBank.openBankAccount();

    }
}
