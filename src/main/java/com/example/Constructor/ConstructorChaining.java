package com.example.Constructor;

class SuperDemo {
    String name;

    SuperDemo(String name) {
        this.name = name;
        System.out.println("Parent class parameterized constructor");
    }

    SuperDemo() {
        this("hi");
        System.out.println("Parent class no-arg constructor" + this.name);
    }

    {
        System.out.println("Parent class init");
    }
}

public class ConstructorChaining extends SuperDemo {
    ConstructorChaining() {
        this(15);
        System.out.println("no-arg constructor");
    }

    ConstructorChaining(int i) {
        super();

        System.out.println("parameterized arg constructor" + i + " Super class name :" + super.name);
    }

    {
        System.out.println("child class init");
    }

    public static void main(String[] args) {
        ConstructorChaining chaining = new ConstructorChaining();
    }
}