package com.company.compositionandaggregation;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Alex", 20);
        Student s2 = new Student("Maria", 21);

        Student[] list = {s1, s2};
        Department d = new Department("Informatica", list);
    }
}
