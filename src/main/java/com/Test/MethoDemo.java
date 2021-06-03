package com.Test;
class Calculate {
    public int sum;
}
public class MethoDemo extends Calculate {
    static int getSum(int a, int b) {
        return a+b;
    }

    static Calculate getCalculates(int a, int b) {
        Calculate cal = new Calculate();
        cal.sum = ((a + b) * 100);
        return cal;
    }

    public static void main(String[] args) {
        int sum = getSum(5, 10);
        System.out.println("Sum :" + sum);
        Calculate cal = getCalculates(5, 10);
        System.out.println(+cal.sum);
    }
}