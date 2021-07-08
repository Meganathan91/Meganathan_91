package com.example.oops.demopolymorphism;

public class OverridingRespectToStatic extends OverloadingMethod {

    public static void display(int a,int b) {
        System.out.println("derived class method :"+(a-b));
    }

    public static void main(String[] args) {
        OverloadingMethod respect = new OverridingRespectToStatic();
        respect.display(15,3);
    }
}


