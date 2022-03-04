package com.company.classes;

// POJOs - plain ol' java object
public class Animal {



    private int age;
    private String name;

    public Animal() {
    }

    public Animal(int age){
        this.age = age;
    }

    // overloaded constructor
    public Animal(int age, String name) {
        this(age);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("This animal makes the sound: ham");
    }

    public void move() {
        System.out.println("This animal moves by: jumping");
    }
}
