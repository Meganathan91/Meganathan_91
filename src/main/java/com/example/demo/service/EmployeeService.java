package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class EmployeeService
{
    private int employeeIdCount=1;
    private List<Employee> employeeList=new CopyOnWriteArrayList<>();
    //Here am consider for employeeList is my database.
    public Employee addEmployee(Employee employee)
       {
          employee.setEmployeeId(employeeIdCount);
          employeeList.add(employee);
          employeeList.add(employee);
          employeeIdCount++;
          return employee;
       }

    public List<Employee> getEmployeeList()
       {
          return employeeList;
       }

    public Employee getEmployee(int employeeId)
    {
          return employeeList
                  .stream()
                  .filter(e -> e.getEmployeeId()==employeeId)
                  .findFirst()
                  .get();

    }

    public Employee updateEmployee(int employeeId, Employee employee)
    {
          employeeList
                  .stream()
                  .forEach(e ->
                  {
                        if(e.getEmployeeId()==employeeId)
                        {
                            e.setEmployeeFirstName(employee.getEmployeeFirstName());
                            e.setEmployeeLastName(employee.getEmployeeLastName());
                            e.setEmployeeEmail(employee.getEmployeeEmail());
                        }
                  });
          return employeeList
                  .stream()
                  .filter(e->e.getEmployeeId()==employeeId)
                  .findFirst()
                  .get();
    }

    public void  deleteEmployee(int employeeId)
    {
          employeeList
                  .stream()
                  .forEach(e -> {
                      if(e.getEmployeeId()==employeeId){
                          employeeList.remove(e);
                      }
                  } );
    }


}
