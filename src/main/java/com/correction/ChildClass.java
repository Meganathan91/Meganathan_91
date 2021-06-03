package com.correction;

class ClassA {
    int sum(int a, int b) {
        return a + b;
    }
}

public class ChildClass extends ClassA {
    int calculate(int a, int b) {
        super.sum(a, b);
        return (sum(a, b) * 100);
    }

    public static void main(String[] args) {
        ChildClass aClass = new ChildClass();
        aClass.calculate(5, 10);
    }
}