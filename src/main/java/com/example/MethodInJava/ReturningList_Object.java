package com.example.MethodInJava;

import java.util.Arrays;
import java.util.List;
public class ReturningList_Object
{
    static List<Object> getDetails()
    {
        String empName="Ajay";
        double salary=25000;
        char initial='S';
        return Arrays.asList(empName,initial,salary);
    }
    public static void main(String[] args)
    {
        List<Object> employee=getDetails();
        //Returning list of object.
        System.out.println(employee);
    }
}
