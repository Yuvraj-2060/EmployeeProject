package com.employeehierarchy.main;

import com.employeehierarchy.model.BackendEndDeveloper;
//import com.employeehierarchy.model.Developer;
import com.employeehierarchy.model.Employee;
import com.employeehierarchy.model.FrontEndDeveloper;
import com.employeehierarchy.model.Manager;
import com.employeehierarchy.repository.EmployeeRepository;
import com.employeehierarchy.repository.EmployeeRepositoryDBImpl;
import com.employeehierarchy.repository.EmployeeRepositoryListBasedImpl;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Manager(101,"Yuvraj","yuvraj@yahoo.com",7);
        Employee employee2 = new BackendEndDeveloper(102,"Ravi","ravi@abc.com","Java","MySql");
//        Employee employee3 = new FrontEndDeveloper(103,"Sameer","sameer@abc.com","ReactJS","MongoDB");

//        employee1.showEmployeeInfo();
//        employee2.showEmployeeInfo();
//        employee3.showEmployeeInfo();


        EmployeeRepository repository = new EmployeeRepositoryListBasedImpl();
        try {
            repository.saveEmployee(employee1);
            repository.saveEmployee(employee2);
            System.out.println("Employees saved successfully!");
        } catch (RuntimeException e) {
            System.out.println("Error occurred while saving employee: " + e.getMessage());
        }

        repository.saveEmployee(employee1);
        repository.saveEmployee(employee2);

        repository.getAllEmployees().forEach(e-> e.showEmployeeInfo());

    }
}
