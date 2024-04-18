package com.employeehierarchy.repository;

import com.employeehierarchy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryListBasedImpl implements EmployeeRepository {
    List<Employee> employees;

    public EmployeeRepositoryListBasedImpl(){
        employees = new ArrayList<>();
    }

    public void saveEmployee(Employee employee) {
        employees.add(employee);
    }


    public Employee findEmployee(int id) {
        return employees.stream().filter(e->e.getEmpid()==id).findFirst().get();
    }


    public void deleteEmployee(int id) {
        Employee employee = findEmployee(id);
        employees.remove(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
