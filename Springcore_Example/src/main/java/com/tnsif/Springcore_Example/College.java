package com.tnsif.Springcore_Example;

public class College {
    private Student student;

    public College() {
        System.out.println("College object is created.");
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void display() {
        System.out.println("Manakula");
        student.display();
    }
}
