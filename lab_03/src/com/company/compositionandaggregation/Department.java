package com.company.compositionandaggregation;

public class Department {
    private String name;
    Student[] students;

    public Department(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }
}
