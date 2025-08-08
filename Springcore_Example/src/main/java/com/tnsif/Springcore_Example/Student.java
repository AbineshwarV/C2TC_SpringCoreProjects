package com.tnsif.Springcore_Example;

public class Student {
    private String name;

    public Student() {
        System.out.println("student objet is created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student:" + name);
    }
}
