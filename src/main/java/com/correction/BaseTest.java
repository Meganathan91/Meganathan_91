package com.correction;

public class BaseTest implements Interface1, Interface2 {

    @Override
    public void test1() {
        System.out.println("Test Method1");
    }

    @Override
    public void test2() {
        System.out.println("Test Method2");

    }

    public static void main(String[] args) {
        Interface1 inter = new BaseTest();
        inter.test1();
        inter.test2();
        Interface2 inter2 = new BaseTest();
        inter2.test1();
        inter2.test2();
    }
}