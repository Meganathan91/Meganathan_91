package com.example.Interface;

public class MethodImplementation implements Employe
{
    @Override
    public void display() {
        System.out.println("We Welcome interface");
    }
    public static void main(String[] args)
    {
        MethodImplementation implementation=new MethodImplementation();
        implementation.display();
        Employe emp=new MethodImplementation();
        emp.display();
    }
}
