package com.example.VariablesDemo;
public class VariableExample
{
    //instance variable or global we can access with in the class scope.
    static String name="WELCOME";
    int i=10;
    int z=30;
    void dis()
    {
        System.out.println("Am not change value of i :"+z);
        System.out.println(" This is from instance variable 10:"+i);
    }
    void display()
    {
        i=20;
        int y=200;
        System.out.println("This is from instance area am changed the i value 20:"+i);
        //System.out.println("Local variable :"+y);
    }
    public static void main(String[] args)
    {
        VariableExample example=new VariableExample();
        VariableExample exam=new VariableExample();
        //exam.dis();
        example.display();
        //example.dis();
        exam.dis();
        //name="BU SOFT TECH";
        //System.out.println("We changed the instance level of static variable :"+name);
        //System.out.println("This is from instance and static variable :"+name);
        //static variable j must we can initialize
        //System.out.println("We can access non static variable in static block using class instance :"+example.z);
        int j=10;
        //System.out.println("Must need to initialize the static block variable :"+j);
        //we can't able to access not static variable into static area
        //System.out.println(i);
           }

}
