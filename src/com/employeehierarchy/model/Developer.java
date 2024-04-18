package com.employeehierarchy.model;

public abstract class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    //    public Developer(){
//
//    }
    public Developer(int id, String name, String email, String programmingLanguage) {
        super(id, name, email);
        this.programmingLanguage = programmingLanguage;
    }
    public void degugCode(){
        System.out.println("Debugging Code");
    }
    public abstract void showEmployeeInfo();

}

