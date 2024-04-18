package com.employeehierarchy.model;

public abstract class Employee {
    private int empid;
    private String ename;
    private String email;

    public Employee(int empid, String ename, String email) {
        this.empid = empid;
        this.ename = ename;
        this.email = email;
    }

    public Employee() {
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        if(empid >0)                    // by encapsulating & using getter setter I can restrict user to add any random data. I'll have a full pledge access of this code.
            this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void showEmployeeInfo();
}
