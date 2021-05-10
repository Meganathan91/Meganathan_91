package com.example.VariablesDemo;

public class DemoConstructor
{
    int i;

    public DemoConstructor() {
        System.out.println(i);
    }

    void display(){
        System.out.println(i);

    }
    public static void main(String[] args) {
        DemoConstructor demoConstructor=new DemoConstructor();
        demoConstructor.display();
    }
}
