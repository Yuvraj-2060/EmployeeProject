package com.employeehierarchy.model;

public class BackendEndDeveloper extends Developer{
    private String database;

    public String getDatabase(){
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public BackendEndDeveloper(String database){
        super();
        this.database = database;
    }

    public BackendEndDeveloper(int id, String name, String email, String programmingLanguage, String database) {
        super(id, name, email, programmingLanguage);
        this.database = database;
    }

    @Override
    public void showEmployeeInfo() {
        System.out.println("*** Developer Info  ***");
        System.out.println(this.getClass().getSimpleName());
        System.out.println("ID : " + this.getEmpid());
        System.out.println("Name : " + this.getEname());
        System.out.println("Email : " + this.getEmail());
        System.out.println("Programming Language : " + getProgrammingLanguage());
        System.out.println("Database : "+database);
    }
}
