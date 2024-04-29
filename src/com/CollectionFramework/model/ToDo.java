package com.CollectionFramework.model;

public record ToDo(String description, int duration, String status) {

    public ToDo(String description, int duration){
        this(description,duration,"Pending");
    }

}