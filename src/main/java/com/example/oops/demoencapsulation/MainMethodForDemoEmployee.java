package com.example.oops.demoencapsulation;

public class MainMethodForDemoEmployee
{

    public static void main(String[] args) {
        DemoEmployee employee=new DemoEmployee();
        employee.setSalary(15000);
        employee.setName("Durai");
        employee.setDesignation("Junior Developer");
        MainMethodForDemoEmployee forDemoEmployee=new MainMethodForDemoEmployee();
        forDemoEmployee.employeeDetails(employee);
    }

    private void employeeDetails(DemoEmployee employee) {
        System.out.println(employee.getName()+" "+"\n"
                +employee.getDesignation()+" "+"\n"
                +employee.getSalary());
    }
}
