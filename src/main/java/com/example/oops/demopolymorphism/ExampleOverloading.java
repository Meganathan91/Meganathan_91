package com.example.oops.demopolymorphism;

public class ExampleOverloading {
    void display(int sittingavailablity) {
        System.out.println("sittingavailablity :" + sittingavailablity);
    }

    void display(float carprice) {
        System.out.println("Price for car :" + carprice);
    }

    void display(float carprice, int sittingavailablity) {
        System.out.println("Price for car :" + carprice);
    }

    void display(int sittingavailablity, float carprice) {
        System.out.println("Price for car :" + carprice);
    }

    public static void main(String[] args) {
        ExampleOverloading overloading = new ExampleOverloading();
        overloading.display(5);
        overloading.display(500000f);
        overloading.display(500000f, 5);
        overloading.display(5, 500000f);
    }

}
