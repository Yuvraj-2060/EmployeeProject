package com.employeehierarchy.repository;

import com.employeehierarchy.model.Employee;
import com.employeehierarchy.exception.InvalidEmployeeInfoException;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryListBasedImpl implements EmployeeRepository {
    List<Employee> employees;

    public EmployeeRepositoryListBasedImpl(){
        employees = new ArrayList<>();
    }

    public void saveEmployee(Employee employee) throws InvalidEmployeeInfoException {
        if(employee.getEmpid() < 0)
            throw new InvalidEmployeeInfoException("Employee ID Can't Be Negative");
        else if(employee.getEname()==null)
            throw new InvalidEmployeeInfoException("Employee Name Can't Be Empty.");
        else if(employee.getEmail()==null)
            throw new InvalidEmployeeInfoException("Employee Email Can't Be Empty.");
        else
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
