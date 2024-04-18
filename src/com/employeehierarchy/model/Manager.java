package com.employeehierarchy.model;

public class Manager extends Employee{
    private int teamSize;

    public Manager(int id, String name, String email, int teamSize){
        super(id,name,email);
        this.teamSize=teamSize;
    }
    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public void showEmployeeInfo(){

        System.out.println("--------- Manager Info ---------\n");
        System.out.println("ID : " + this.getEmpid());
        System.out.println("Name : " + this.getEname());
        System.out.println("Email : " + this.getEmail());
        System.out.println("Team Size: "+teamSize);
    }
}
